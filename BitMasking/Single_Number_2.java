import java.util.*;

public class Single_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3,1,2,1 };
        SingleNumber(arr);
    }

    public static void SingleNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];

        }
        int mask = ans & (~(ans - 1));
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) != 0) {
                b = b ^ arr[i];
            }
        }
        int a = ans ^ b;
        System.out.println(a + " " + b);
    }
}
