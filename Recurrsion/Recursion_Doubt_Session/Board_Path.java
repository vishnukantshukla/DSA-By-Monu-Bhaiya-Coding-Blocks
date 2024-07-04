package Recursion_Doubt_Session;

import java.util.*;

public class Board_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = CountSubset(arr, target, 0, 0, "");
        System.out.println("\n" + res);
    }

    private static int CountSubset(int[] arr, int target, int i, int ans, String st) {
        if (i == arr.length) {
            if (ans == target) {
                System.out.print(st);
                return 1;
            }
            return 0;
        }
        int a = 0;
        a += CountSubset(arr, target, i + 1, ans + arr[i], st + arr[i] + " ");
        a += CountSubset(arr, target, i + 1, ans, st);
       
        return a;
    }

}
