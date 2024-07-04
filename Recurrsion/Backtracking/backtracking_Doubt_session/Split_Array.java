package Backtracking.backtracking_Doubt_session;

import java.util.*;

public class Split_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int res = Subset(arr, 0, 0, "", "", 0);
        System.out.println(res);
    }

    public static int Subset(int arr[], int i, int ans, String st, String st1, int ans1) {
        if (i == arr.length) {
            if (ans == ans1) {
                System.out.println(st + "and " + st1);
                return 1;
            }

            return 0;
        }
        int count = 0;
        count += Subset(arr, i + 1, ans + arr[i], st + arr[i] + " ", st1, ans1);
        count += Subset(arr, i + 1, ans, st, st1 + arr[i] + " ", ans1 + arr[i]);
        return count;
    }
}
