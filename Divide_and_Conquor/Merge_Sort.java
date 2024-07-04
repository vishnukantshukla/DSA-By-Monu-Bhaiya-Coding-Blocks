package Divide_and_Conquor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 15, 7, 1 };
        int res[] = merge_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(res));
    }

    public static int[] merge_sort(int arr[], int low, int high) {
        if(low==high){
            int a[]=new int[1];
            a[0]=arr[low];
            return a;
        }
        int mid = (low + high) / 2;
        int fs[] = merge_sort(arr, low, mid);
        int ss[] = merge_sort(arr, mid + 1, high);
        return merge_Two_Sorted_Array(fs, ss);
    }

    private static int[] merge_Two_Sorted_Array(int[] arr, int[] arr1) {
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
