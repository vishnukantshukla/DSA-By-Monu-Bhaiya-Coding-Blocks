import java.util.*;

public class Boston_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += SumOfDigit(i);
                num /= i;
            }
        }
        int sum1 = SumOfDigit(num2);
        if (sum1 == sum) {
            System.out.println("Given number is a Bostonn number");
        } else {
            System.out.println("Given number is not a boston number");
        }
    }

    private static int SumOfDigit(int num2) {
        int sum = 0;
        while (num2 > 0) {
            sum += num2 % 10;
            num2 /= 10;
        }
        return sum;
    }
}