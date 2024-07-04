package Backtracking.Lec7;

import java.util.*;

public class Coin_Combintion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = new int[sc.nextInt()];
        for (int i = 0; i < coin.length; i++) {
            coin[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        printCombination(coin, amount, "", 0);
    }

    private static void printCombination(int[] coin, int amount, String ans, int ind) {
        if (amount == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = ind; i < coin.length; i++) {
            if (amount >= coin[i]) {
                printCombination(coin, amount - coin[i], ans + coin[i], i); // infinte supply hai yesliya yah pe i
                                                                            // pass
                                                                            // kiya or agar infinite supply nhi hoga
                                                                            // to
                                                                            // i+1 se loop chalate....
            }
        }
    }
}
