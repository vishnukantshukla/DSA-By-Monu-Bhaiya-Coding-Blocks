package BinarySearch;

import java.util.*;

public class Find_the_square_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = FindSquare(num);
        System.out.println(res);
    }

    private static int FindSquare(int num) {
        int low = 0;
        int high = num;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= num) {

                ans = mid;

                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
