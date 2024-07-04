package Divide_and_Conquor;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 56, -9, 56, 5, 68, 5, 62, 3, 2, 1, 3, 47 };
        int idx = index(arr, 0, arr.length - 1);
        System.out.println(idx);
        System.out.println(Arrays.toString(arr));
    }

    public static int index(int arr[], int low, int high) {
        int laast_element = arr[high]; // hi --> high && lo--> low
        int idx = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= laast_element) {
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
