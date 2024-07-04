package Lec5;

import java.util.*;

public class Lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Lexicographical_Order(0, num);
    }

    private static void Lexicographical_Order(int curr, int num) {
        if (curr > num) {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            Lexicographical_Order(curr * 10 + i, num);
        }
    }
}
