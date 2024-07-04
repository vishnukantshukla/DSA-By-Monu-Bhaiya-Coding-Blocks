import java.util.*;

public class Count_the_combination_of_Toss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = CoinToss(num, "");
        System.out.println("\n" + "The Total number of Coin Combination are =>  " + res);
    }

    private static int CoinToss(int num, String ans) {
        if (num == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        int a = CoinToss(num - 1, ans + "H");
        int b = CoinToss(num - 1, ans + "T");
        return a + b;
    }
}
