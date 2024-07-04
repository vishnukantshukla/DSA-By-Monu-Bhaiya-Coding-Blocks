import java.util.*;

public class print_n_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print_N_PRIME_NUMBER(num);

    }

    public static void Print_N_PRIME_NUMBER(int num) {
        for (int i = 2; i <= num; i++) {
            int fact = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    fact++;
                    break;
                }
            }
            if (fact == 0) {
                System.out.println(i);
            }

        }

    }

    // to format the code use ---> shift+alt+f

}