package Lec1;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println(res);
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        // sp=n-1;
        int fn = fact(n - 1); // recusive call
        return fn * n;
    }
}