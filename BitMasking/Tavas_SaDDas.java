import java.util.*;

public class Tavas_SaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int res = SadDas(st);
        System.out.println(res);

    }

    public static int SadDas(String str) {
        int n = str.length();
        int count = (1 << n) - 2; // 1 to n-1 length ke saare lucky number ka count hai
        int pos = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '7') {
                count = count + (1 << pos);
            }

            pos++;
        }
        return count + 1;

    }
}
