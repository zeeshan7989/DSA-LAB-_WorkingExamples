/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author muham
 */


import java.util.*;

public class project {
    static class Node implements Comparable<Node> {
        int city;
        int days;

        Node(int city, int days) {
            this.city = city;
            this.days = days;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.days, other.days);
        }
    }

    public static int bfsMinimumDays(int totalCities, List<int[]> aerialRoutes) {
        List<int[]>[] graph = new ArrayList[totalCities];
        for (int i = 0; i < totalCities; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < totalCities; i++) {
            for (int j = 1; j <= 6 && i + j < totalCities; j++) {
                graph[i].add(new int[]{i + j, 1});
            }
        }

        for (int[] route : aerialRoutes) {
            int src = route[0];
            int dest = route[1];
            graph[src].add(new int[]{dest, 0});
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[totalCities];
        pq.add(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentCity = current.city;
            int currentDays = current.days;

            if (currentCity == totalCities - 1) {
                return currentDays;
            }

            if (visited[currentCity]) continue;
            visited[currentCity] = true;

            for (int[] neighbor : graph[currentCity]) {
                int nextCity = neighbor[0];
                int travelCost = neighbor[1];

                if (!visited[nextCity]) {
                    pq.add(new Node(nextCity, currentDays + travelCost));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        int testCases = scan.nextInt();

        for (int t = 0; t < testCases; t++) {
            System.out.println("Enter number of cities: ");
            int totalCities = scan.nextInt();

            System.out.println("Enter number of Aerial routes: ");
            int numAerialRoutes = scan.nextInt();

            List<int[]> aerialRoutes = new ArrayList<>();
            System.out.println("Enter the Aerial Routes: ");

            for (int i = 0; i < numAerialRoutes; i++) {
                int src = scan.nextInt();
                int dest = scan.nextInt();
                aerialRoutes.add(new int[]{src, dest});
            }

            int result = bfsMinimumDays(totalCities, aerialRoutes);
            System.out.println("Minimum number of days to travel from city 1 to city " + totalCities + ": " + result);
        }
    }
}

