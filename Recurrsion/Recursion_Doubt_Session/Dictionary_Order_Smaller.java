package Recursion_Doubt_Session;

import java.util.*;

public class Dictionary_Order_Smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st1 = st;
        List<String> ans = new ArrayList<>();
        PrintPermutataion(st, "", st1, ans);
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    public static void PrintPermutataion(String ques, String ans, String st1, List<String> list) {
        if (ques.length() == 0) {
            if (ans.compareTo(st1) < 0) {
                list.add(ans);
            }

            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            PrintPermutataion(ques.substring(0, i) + ques.substring(i + 1), ans + ques.charAt(i), st1, list);
        }
    }
}
