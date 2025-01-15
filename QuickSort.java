/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 123
 */

public class QuickSort {
    int[] a = {22, 58, 47, 96, 45, 32, 12};

    int partition(int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    void sort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            sort(low, pi - 1);
            sort(pi + 1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int max = obj.a.length;

        System.out.println("Array before sorting:");
        for (int i = 0; i < max; i++) {
            System.out.println(obj.a[i]);
        }

        obj.sort(0, max - 1);

        System.out.println("\nArray after sorting:");
        for (int i = 0; i < max; i++) {
            System.out.println(obj.a[i]);
        }
    }
}

