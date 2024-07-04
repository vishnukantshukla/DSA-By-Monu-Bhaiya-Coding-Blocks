package Sorting;

import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (arr[j] < arr[min_index]) {
                        min_index = j;
                    }

                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
