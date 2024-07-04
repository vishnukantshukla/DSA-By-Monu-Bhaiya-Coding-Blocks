package Backtracking.Lec7;
import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Subset(arr, 0, "", ll, ans);
        System.out.println(ans);
    }

    private static void Subset(int[] arr, int i, String ans, List<Integer> ll, List<List<Integer>> ans1) {
        if (i == arr.length) {
            ans1.add(new ArrayList<>(ll));
            System.out.println(ans);
            return;
        }

        Subset(arr, i + 1, ans, ll, ans1);
        ll.add(arr[i]);
        Subset(arr, i + 1, ans + arr[i], ll, ans1);
        ll.remove(ll.size() - 1);
    }

}
