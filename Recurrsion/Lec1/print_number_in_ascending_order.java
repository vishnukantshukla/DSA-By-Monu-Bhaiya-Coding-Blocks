package Lec1;
import java.util.*;

public class print_number_in_ascending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print_Ascending(num);
    }

    private static void Print_Ascending(int num) {
        if (num == 0) {
            return;
        }
        Print_Ascending(num - 1);
        System.out.println(num);
    }

}
