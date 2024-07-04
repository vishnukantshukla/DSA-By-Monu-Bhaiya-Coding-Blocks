package Backtracking.backtracking_Doubt_session;

import java.util.*;

public class Vivek_loves_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while (test_case-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(LovesArray(arr, 0, n - 1));
        }
    }

    private static int LovesArray(int[] arr, int si, int ei) {
        for (int mid = si; mid < ei; mid++) {
            int sum1 = 0;
            for (int i = si; i <= mid; i++) {
                sum1 += arr[i];
            }
            int sum2 = 0;
            for (int i = mid + 1; i <= ei; i++) {
                sum2 += arr[i];
            }
            if (sum1 == sum2) {
                int lf = LovesArray(arr, si, mid);
                int rf = LovesArray(arr, mid + 1, ei);
                return Math.max(lf, rf) + 1;
            }
        }
        return 0;

    }

}
