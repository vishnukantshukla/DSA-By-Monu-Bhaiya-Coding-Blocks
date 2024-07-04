package Sorting;

import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int arr[]) {
        // pass
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
