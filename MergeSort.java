/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 123
 */

public class MergeSort {
    int[] a = {22, 58, 47, 96, 45, 32, 12};
    int[] b = new int[a.length];

    void merging(int low, int mid, int high) {
        int left = low, right = mid + 1, i = low;

        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                b[i] = a[left];
                left++;
            } else {
                b[i] = a[right];
                right++;
            }
            i++;
        }

        while (left <= mid)
            b[i++] = a[left++];

        while (right <= high)
            b[i++] = a[right++];

        for (i = low; i <= high; i++)
            a[i] = b[i];
    }

    void sort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merging(low, mid, high);
        }
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
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
