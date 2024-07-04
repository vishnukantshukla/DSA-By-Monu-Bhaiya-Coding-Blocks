package String;

import java.util.*;

public class print_all_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        Substring(st);
    }

    private static void Substring(String st) {
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                System.out.println(st.substring(i, j));
            }
        }
    }
}
