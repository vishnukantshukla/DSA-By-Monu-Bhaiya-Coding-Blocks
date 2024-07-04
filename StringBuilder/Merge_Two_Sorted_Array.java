package StringBuilder;

import java.util.*;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[sc.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int res[] = SortedArray(arr, arr1);
        System.out.println(Arrays.toString(res));
    }

    private static int[] SortedArray(int[] arr, int[] arr1) {
        int i = 0;
        int j = 0;
        int res[] = new int[arr.length + arr1.length];
        int k = 0;
        while (i < arr.length && j < arr1.length) {
            if (arr[i] <= arr1[j]) {
                res[k] = arr[i];
                i++;
                k++;
            } else {
                res[k] = arr1[j];
                j++;
                k++;
            }
        }

        while (i < arr.length) {
            res[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr1.length) {
            res[k] = arr1[j];
            j++;
            k++;

        }

        return res;
    }

}
