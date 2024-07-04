
import java.util.*;

public class Coin_Toss_Except_2_Head {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Coin_Toss(num, "");
    }

    public static void Coin_Toss(int num, String ans) {
        if (num == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            Coin_Toss(num - 1, ans + "H");
        }

        Coin_Toss(num - 1, ans + "T");
    }
}
