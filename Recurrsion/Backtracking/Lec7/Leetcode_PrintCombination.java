package Backtracking.Lec7;

import java.util.*;

public class Leetcode_PrintCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = new int[sc.nextInt()];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printCombination(coin, amount, 0, ll, ans);
        System.out.println(ans);
    }

    private static void printCombination(int[] coin, int amount, int ind, List<Integer> ll,
            List<List<Integer>> ans) {
        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = ind; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                printCombination(coin, amount - coin[i], i, ll, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
}
