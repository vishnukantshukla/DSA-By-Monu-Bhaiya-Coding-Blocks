package Lec5;

import java.util.*;

public class Tower_OF_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintSteps(num, "A", "B", "C");
    }

    private static void PrintSteps(int num, String src, String hel, String des) {
        if (num == 0) {
            return;
        }
        PrintSteps(num - 1, src, des, hel);
        System.out.println("Move " + num + "th from " + src + " to " + des);
        PrintSteps(num - 1, hel, src, des);
    }
}
