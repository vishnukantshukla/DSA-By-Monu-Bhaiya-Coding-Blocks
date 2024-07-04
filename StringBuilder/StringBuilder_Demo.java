package StringBuilder;

import java.util.*;

public class StringBuilder_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        System.out.println(sb.length());

        sb = sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("World");
        sb.append("World");

        System.out.println(sb.capacity());

        String s = sb.toString();
        System.out.println(s);
    }
}
