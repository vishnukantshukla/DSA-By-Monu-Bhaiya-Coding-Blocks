package Lec1;

import java.util.*;

public class Print_number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintNum(num);
    }

    private static void PrintNum(int num) {
        if (num == 0) {
            System.out.println(0 + " ");
            return;
        }
        System.out.println(num);
        PrintNum(num - 1);
        System.out.println(num);
    }
}
