package Lec4;

import java.util.*;

public class Permutation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Permutation_without_repeatation(str, "");
    }

    private static void Permutation_without_repeatation(String str, String string) {
        if (str.length() == 0) {
            System.out.println(string);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            int cnt = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) {
                Permutation_without_repeatation(str.substring(0, i) + str.substring(i + 1), string + str.charAt(i));
            }

        }
    }
}
