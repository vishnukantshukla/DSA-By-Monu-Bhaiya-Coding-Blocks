import java.util.Arrays;
import java.util.Scanner;

import Lec1.sum_of_n_number;

public class Rotate_Array2 {
    public static void main(String[] args) {
        // using reversal algorithm
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % arr.length;
        Reverse(arr, arr.length - k, arr.length - 1);
        Reverse(arr, 0, arr.length - k - 1);
        Reverse(arr, 0, arr.length - 1);
    }

    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();
    }
}
