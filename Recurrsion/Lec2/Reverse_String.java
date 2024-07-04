package Lec2;

import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st2 = Reverse(st, st.length() - 1, "");
        System.out.println(st2);
    }

    private static String Reverse(String st, int i, String ans1) {
        if (i < 0) {
            return ans1;
        }
        ans1 += st.charAt(i);
        return Reverse(st, i - 1, ans1);

    }
}
