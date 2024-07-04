package BinarySearch;

import java.util.*;

public class First_Bad_version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = FirstBad(num);
        System.out.println(res);
    }

    private static int FirstBad(int num) {
        int low = 1;
        int high = num;
        int ans = 0;
        while (low <= high) {
            int mid = low + high / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                high = mid - 1; // isBadVersion(version) is a api so ham yeh question sirf leetcode pe run kar
                                // payege...
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static boolean isBadVersion(int mid) {
            return false;
    }
}
