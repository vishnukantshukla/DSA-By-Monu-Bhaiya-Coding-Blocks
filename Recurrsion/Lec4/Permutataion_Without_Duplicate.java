package Lec4;

import java.util.*;

public class Permutataion_Without_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Permutation(str, "");
    }

    public static void Permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            // agar flag false hua to yeska mtlb aage character hai bha pe.......
            if (flag == true) {
                Permutation(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
            }

        }
    }
}