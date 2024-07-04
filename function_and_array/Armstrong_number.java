import java.util.*;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int len = No_Of_digit(num1);

        System.out.println(Armstrong(num1, len));
    }

    private static boolean Armstrong(int num1, int len) {
        int sum = 0;
        int num2 = num1;
        while (num1 > 0) {
            int rem = num1 % 10;
            sum = (int) (sum + Math.pow(rem, len));
            num1 /= 10;
        }
        if (num2 == sum) {
            return true;
        }
        return false;
    }

    private static int No_Of_digit(int num1) {
        int count = 0;
        while (num1 > 0) {
            count++;
            num1 /= 10;
        }
        return count;
    }
}
