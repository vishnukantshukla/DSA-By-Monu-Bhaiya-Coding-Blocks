package Recursion_Doubt_Session;

import java.util.*;

public class Recursion_Ascii_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = AciiSubsequence(str, "");
        System.out.println("\n" + res);
    }

    private static int AciiSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        int count = 0;
        count += AciiSubsequence(str.substring(1), ans);
        count += AciiSubsequence(str.substring(1), ans + str.charAt(0));
        count += AciiSubsequence(str.substring(1), ans + (int) str.charAt(0));
        return count;

    }
}
