package Recursion_Doubt_Session;

import java.util.*;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int res = Twins(st);
        System.out.println(res);
    }

    private static int Twins(String st) {
        if (st.length() < 3) {
            return 0;
        }
        int ans = 0;
        if (st.charAt(0) == st.charAt(2)) {
            ans++;
        }

        ans += Twins(st.substring(1));
        return ans;
    }
}
