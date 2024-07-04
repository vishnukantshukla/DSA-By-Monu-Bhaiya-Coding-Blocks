package Recursion_Doubt_Session;

import java.util.*;

public class Binary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        while (test_case-- > 0) {
            String str = sc.next();
            BinaryString(str, "");
            System.out.println();
        }

    }

    private static void BinaryString(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        if (ch == '?') {
            BinaryString(str.substring(1), ans + "0");
            BinaryString(str.substring(1), ans + "1");
        } else {
            BinaryString(str.substring(1), ans + ch);
        }
    }
}
