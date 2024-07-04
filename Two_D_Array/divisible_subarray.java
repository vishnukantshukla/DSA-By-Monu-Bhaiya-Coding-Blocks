package Two_D_Array;

import java.util.*;

public class divisible_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(GoodSubArray(arr, arr.length));
        }
    }

    public static long GoodSubArray(int arr[], int k) {
        int sum = 0;
        long freq[] = new long[k];
        freq[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = sum + k;
            }
            sum %= k;
            freq[sum] = freq[sum] + 1;
            System.out.println(Arrays.toString(freq));
        }
        long ans = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 2) {
                ans = ans + (freq[i] * (freq[i] - 1)) / 2;
            }
        }
        return ans;
    }
}
