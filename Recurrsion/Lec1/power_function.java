package Lec1;
import java.util.*;

public class power_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a_power_b(a, b);
        System.out.println(res);
    }

    private static int a_power_b(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int ans = a_power_b(a, b - 1);  //a ^ (b-1
        return a * ans;
    }
}
