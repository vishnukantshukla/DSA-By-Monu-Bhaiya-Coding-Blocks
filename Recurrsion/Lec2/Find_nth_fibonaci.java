package Lec2;

import java.util.*;

public class Find_nth_fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Fibo(num);
        System.out.println(res);
    }

    private static int Fibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int ans = Fibo(num - 1) + Fibo(num - 2);
        return ans;
    }
}
