package Lec2;

import java.util.*;

public class factorial_tail_recurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Facto(num, 1);
        System.out.println(res);
    }

    private static int Facto(int num, int ans) {
        if (num == 1) {
            return num * ans;
        }
        ans *= num;
        return Facto(num - 1, ans);
    }
}