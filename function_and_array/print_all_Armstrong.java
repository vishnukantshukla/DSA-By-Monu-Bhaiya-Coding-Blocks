import java.util.*;

public class print_all_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1 < num2) {
            if (Armstrong(num1)) {
                System.out.println(num1);
            }
            num1++;
        }

    }

    private static boolean Armstrong(int num1) {
        int len = num_of_digit(num1);
        int temp = num1;
        int sum = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            sum += Math.pow(rem, len);
            num1 /= 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    private static int num_of_digit(int num1) {
        int count = 0;
        while (num1 > 0) {
            count++;
            num1 /= 10;
        }
        return count;
    }

}
