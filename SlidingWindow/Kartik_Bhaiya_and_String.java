package SlidingWindow;

import java.util.*;

public class Kartik_Bhaiya_and_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String st = sc.next();
        int flipa = maximumlength(st, k, 'a');
        System.out.println(flipa);
        int flipb = maximumlength(st, k, 'b');
        System.out.println(flipb);
        System.out.println(Math.max(flipa, flipb));
    }

    public static int maximumlength(String str, int k, char ch) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;
        while (ei < str.length()) {
            // window grow
            if (str.charAt(ei) == ch) {
                flip++;
            }

            // window shrink
            while (flip > k && si <= ei) {
                if (str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }

            // ans find karna
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
