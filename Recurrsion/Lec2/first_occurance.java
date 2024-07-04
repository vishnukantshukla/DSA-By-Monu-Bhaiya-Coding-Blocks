package Lec2;

import java.util.*;

public class first_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = FirstOccurance(arr, target, 0);
        System.out.println(res);
    }

    public static int FirstOccurance(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return FirstOccurance(arr, target, i + 1);

    }
}
