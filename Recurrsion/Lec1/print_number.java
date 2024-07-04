package Lec1;
import java.util.*;

public class print_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print_Decreasing(num);
    }

    public static void Print_Decreasing(int num) {

        if (num == 0) {
            return;
        }
        System.out.println(num);
        Print_Decreasing(num - 1);
    }
}
