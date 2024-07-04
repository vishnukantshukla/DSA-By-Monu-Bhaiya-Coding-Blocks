package Recursion_Doubt_Session;

import java.util.*;

public class Nth_Triangle_Recurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = NthTriangle(num);
        System.out.println(res);
    }

    private static int NthTriangle(int num) {
        if (num == 0) {
            return num;
        }

        int ans = NthTriangle(num - 1);
        return num + ans;
    }
}
