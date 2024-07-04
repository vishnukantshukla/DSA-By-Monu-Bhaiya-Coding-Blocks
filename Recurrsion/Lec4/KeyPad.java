package Lec4;

import java.util.*;

public class KeyPad {
    static String Key[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wxyz" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        KeyPad(st, "");
    }

    private static void KeyPad(String st, String ans) {
        if (st.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        char ch = st.charAt(0);
        String press = Key[ch - '0'];

        for (int i = 0; i < press.length(); i++) {
            KeyPad(st.substring(1), ans + press.charAt(i));
        }
    }
}
