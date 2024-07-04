import java.util.*;

public class Even_Odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Chech_whether_Num_is_Even_Or_Odd(num));

    }

    private static String Chech_whether_Num_is_Even_Or_Odd(int num) {
        if ((num & 1) == 1) {
            return "odd";
        }
        return "even";
    }
}