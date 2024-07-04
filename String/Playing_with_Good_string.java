package String;

import java.util.*;

public class Playing_with_Good_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int res = GoodString(st);
        System.out.println(GoodString(st));
    }

    private static int GoodString(String st) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    // private static int GoodString(String st) {
    // int max = 0;
    // for (int i = 0; i < st.length(); i++) {
    // for (int j = i + 1; j <= st.length(); j++) {
    // String s = st.substring(i, j);
    // if (vowel_substring(s)) {
    // max = Math.max(max, s.length());
    // }
    // }
    // }
    // return max;
    // }

    // private static boolean vowel_substring(String s) {
    // int i = 0;
    // int j = s.length() - 1;
    // int count = 0;
    // while (i <= j) {
    // if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
    // s.charAt(i) == 'o'
    // || s.charAt(i) == 'u') {
    // count++;
    // }
    // i++;
    // }
    // if (count == s.length()) {
    // return true;
    // }
    // return false;
    // }

}