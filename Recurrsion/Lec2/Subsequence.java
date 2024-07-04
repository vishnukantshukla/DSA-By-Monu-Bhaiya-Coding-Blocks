package Lec2;

import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Subsequence(st, "");
    }

    public static void Subsequence(String st, String ans) {
        if (st.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = st.charAt(0);
        Subsequence(st.substring(1), ans);
        Subsequence(st.substring(1), ans + ch);
    }
}
