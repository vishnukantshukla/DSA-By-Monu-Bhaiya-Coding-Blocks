package Backtracking.Lec8;

import java.util.*;

public class Pallindrome_Partioning {
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
            String str = st.substring(0, i);
            if (isPallindrome(str)) {
                Partioning_1(st.substring(i), string + st.substring(0, i) + "|");
            }

        }
    }

    public static boolean isPallindrome(String st) {
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
