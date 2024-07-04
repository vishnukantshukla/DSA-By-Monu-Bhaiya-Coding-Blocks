package Recursion_Doubt_Session;

import java.util.*;

public class Subset_Recurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        PrintSubset(arr, 0, "");

    }

    private static void PrintSubset(int[] arr, int index, String ans) {
        if (index == arr.length) {
            System.out.print(ans);
            return;
        }
        PrintSubset(arr, index + 1, ans);
        PrintSubset(arr, index + 1, ans + arr[index]);
        
    }
}
