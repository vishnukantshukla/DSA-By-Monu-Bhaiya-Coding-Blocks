import java.util.*;

public class Magic_Number {

    // this question come on Amazon...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Number(num));
    }

    public static int Number(int num) {
        int ans = 0;
        int mul = 5;
        while (num != 0) {
            if ((num & 1) != 0) {
                ans = ans + mul;
            }
            mul = mul * 5;
            num >>= 1;
        }
        return ans;
    }
}
