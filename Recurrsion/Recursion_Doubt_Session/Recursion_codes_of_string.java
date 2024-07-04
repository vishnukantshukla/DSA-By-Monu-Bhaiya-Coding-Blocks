package Recursion_Doubt_Session;

import java.util.*;

public class Recursion_codes_of_string {
    static String arr[] = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        ArrayList<String> ans = new ArrayList<>();
        Codes_Of_String(st, "", ans);
        System.out.println(ans);

    }

    private static void Codes_Of_String(String st, String ans, ArrayList<String> list) {
        if (st.length() == 0) {
            list.add(ans);
            return;
        }
        char ch = st.charAt(0);
        String str = arr[ch - 48];
        Codes_Of_String(st.substring(1), ans + str, list);
        if (st.length() >= 2) {
            String s1 = st.substring(0, 2);
            int n = Integer.parseInt(s1); // numeric String --> Integer
            if(n<=26){
                Codes_Of_String(st.substring(2), ans + arr[n], list);
            }
           
        }
    }
}
