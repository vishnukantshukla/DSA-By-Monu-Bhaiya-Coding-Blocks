package String;

import java.util.*;

public class pallindromic_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        printSubstring(st);
    }

    private static void printSubstring(String st) {
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                String s = st.substring(i, j);
                if (isPallindrome(s) == true) {
                    System.out.println(s);
                }
            }
        }
    }

    private static boolean isPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
