
import java.util.*;

public class Coin_Toss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CoinToss(num, "");
    }

    private static void CoinToss(int num, String ans) {
        if (num == 0) {
            System.out.print(ans + " ");
            return;
        }
        CoinToss(num - 1, ans + "H");
        CoinToss(num - 1, ans + "T");
    }
}
