package Divide_and_Conquor;

import java.util.*;

public class Quick_Sort_Algorithm {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 56, -9, 56, 5, 68, 5, 62, 3, 2, 1, 3, 47 };
        Quick_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Quick_Sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int idx = Partition(arr, low, high);
        Quick_Sort(arr, low, idx - 1);
        Quick_Sort(arr, idx + 1, high);
    }

    public static int Partition(int arr[], int low, int high) {
        int pivot = arr[high]; // last element is a pivot element
        int idx = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                // i , idx
                int t = arr[i];
                arr[i] = arr[idx];
                arr[idx] = t;
                idx++;
            }

        }
        int t = arr[idx];
        arr[idx] = arr[high];
        arr[high] = t;

        return idx;

    }
}
