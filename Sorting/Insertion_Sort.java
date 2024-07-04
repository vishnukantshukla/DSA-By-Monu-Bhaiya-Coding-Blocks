package Sorting;

import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int item = arr[i];
            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];

                j--;

            }
            arr[j + 1] = item;
        }
    }
}
