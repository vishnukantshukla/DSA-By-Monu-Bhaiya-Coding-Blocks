package Backtracking.Lec7;

import java.util.*;

public class Coin_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = new int[sc.nextInt()];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        printPermutation(coin, amount, "");
    }

    private static void printPermutation(int[] coin, int amount, String ans) {
        if (amount == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                printPermutation(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }
}
