package Two_D_Array;

import java.util.Arrays;

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int out[] = new int[n];
        int prod = 1;

        out[0] = nums[0];
        for (int i = 1; i < n; i++) {
            out[i] = out[i - 1] * nums[i];
        }

        // 1 2 3 4
        // 1 1*2 1*2*3 1*2*3*4
        System.out.println(Arrays.toString(out));
        System.out.println(Arrays.toString(nums));
        for (int i = n - 1; i > 0; i--) {
            int swap = nums[i];
            nums[i] = out[i - 1] * prod;
            prod *= swap;
            System.out.println("pr: " + prod);
        }

        System.out.println(Arrays.toString(nums));
        nums[0] = prod;
        return nums;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[] { 4, 3, 2, 1, 2 });
    }
}