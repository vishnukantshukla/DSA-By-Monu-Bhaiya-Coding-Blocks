package Backtracking.Lec8;

import java.util.*;

public class Partioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Partioning_1(st, "");
    }

    private static void Partioning_1(String st, String string) {
        if (st.length() == 0) {
            System.out.println(string);
            return;
        }
        for (int i = 1; i <= st.length(); i++) {
            Partioning_1(st.substring(i), string + st.substring(0, i) + "|");
        }
    }
}
