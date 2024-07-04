import java.util.*;
public class Global_variable {
    static Scanner sc=new Scanner(System.in);
    static int val=100; //global variable --> method ke bhar rehega and class ke aanadar banega
    public static void main(String[] args) {
        System.out.println("Hey");
        int x = 90;
        fun(x);
    }

    public static void fun(int x) {
        int sum=sc.nextInt();
        int a = 90;
        System.out.println(x);
    }

    public static void fun1(int x) {
        int a2 = 80;
        System.out.println(x);
    }
}
