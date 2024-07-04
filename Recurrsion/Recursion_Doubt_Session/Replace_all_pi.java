package Recursion_Doubt_Session;

import java.util.*;

public class Replace_all_pi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while (test_case-- > 0) {
            String st = sc.next();
            String ans = "";
            ans += st.charAt(0);
            ReplacePie(st, ans);
            System.out.println();
        }

    }

    public static void ReplacePie(String st, String ans) {
        if (st.length() == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.charAt(ans.length() - 1) == st.charAt(0)) {
            ReplacePie(st.substring(1), ans.substring(0, ans.length()) + "3.14");
        } else {
            ReplacePie(st.substring(1), ans + st.charAt(0));
        }
    }
}
