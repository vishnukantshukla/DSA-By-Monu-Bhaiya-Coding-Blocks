import java.util.*;

public class Set_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println(SetBit(num, pos));

    }

    private static int SetBit(int num, int pos) {
        int mask = (1 << pos);
        return num | mask;
    }
}
