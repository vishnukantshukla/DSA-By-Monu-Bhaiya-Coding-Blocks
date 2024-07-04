import java.util.*;

public class Count_the_number_of_Subsequence {
    static int count = 0;  // we can do counting the subsequence and count the number of recurssive call  either by using the static (By taking the Global Variable) or we can take the local variable (Local Variable)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int res = CountSubSequence(st, "");
        System.out.println(res);
        System.out.println(count);
    }

    public static int CountSubSequence(String st, String ans) {
        if (st.length() == 0) {
            // System.out.println(ans);
            count++;
            return 1;
        }
        int a = CountSubSequence(st.substring(1), ans);
        int b = CountSubSequence(st.substring(1), ans + st.charAt(0));
        return a + b;
    }
}
