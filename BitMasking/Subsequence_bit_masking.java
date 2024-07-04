import java.util.*;

public class Subsequence_bit_masking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        Subsequence(str);
    }

    public static void Subsequence(String str) {
        for (int i = 0; i < 1 << str.length(); i++) {
            PrintPattern(i, str);
        }
    }

    private static void PrintPattern(int i, String str) {
        int pos = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                System.out.print(str.charAt(pos));
            }
            pos++;
            i >>= 1;
        }
        System.out.println();
    }

}
