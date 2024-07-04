package Lec2;

import java.util.*;

public class All_Occurance_item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        All_Occurance(arr, target, 0, ans);
        if (ans.size() >= 1) {
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void All_Occurance(int arr[], int target, int i, ArrayList<Integer> ans) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        All_Occurance(arr, target, i + 1, ans);
    }
}
