import java.util.*;

public class Add_Two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // int res = ADD_TWO_NUMBER(num1, num2);
        // System.out.println(res);
        System.out.println(ADD_TWO_NUMBER(num1, num2));

    }

    // public static int ADD_TWO_NUMBER(int num1, int num2) {
    // int sum = 0;
    // sum = num1 + num2;
    // return sum;
    // }

    public static int ADD_TWO_NUMBER(int num1, int num2) {
        return num1 + num2;
    }
}
