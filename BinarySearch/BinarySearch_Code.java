package BinarySearch;

import java.util.*;

public class BinarySearch_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(Binary_Search(arr, target));
    }

    private static int Binary_Search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }
}
