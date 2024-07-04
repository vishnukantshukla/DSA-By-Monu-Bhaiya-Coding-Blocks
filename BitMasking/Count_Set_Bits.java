import java.util.*;

public class Count_Set_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Count_SetBit(num);
        System.out.println(res);
    }

    private static int Count_SetBit(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }
}
