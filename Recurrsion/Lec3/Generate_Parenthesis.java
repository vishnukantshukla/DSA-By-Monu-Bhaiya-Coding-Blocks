import java.util.*;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Parenthesis(num, " ", 0, 0);
    }

    private static void Parenthesis(int num, String ans, int open, int close) {
        if (open == num && close == num) {
            System.out.println(ans);
            return;
        }
        if (open < num) {
            Parenthesis(num, ans + "(", open + 1, close);
        }
        if (close < open) {
            Parenthesis(num, ans + ")", open, close + 1);
        }
    }

}
