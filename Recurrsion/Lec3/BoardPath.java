import java.util.*;

public class BoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = BoardPath(num, "");
        System.out.println("\n" + res);
        // int res1= BoardPath_1(num, "", 0);
        // System.out.println(res1);
    }

    // Method 1 -- yesme hame path find karna hai i.e agar 4 hua to possible path
    // 1111,121,112 etc.. hoge..
    private static int BoardPath(int num, String string) {
        if (num == 0) {
            System.out.print(string + " ");

            return 1;
        }
        if (num < 0) {
            return 0;
        }

        int fp = BoardPath(num - 1, string + '1'); // fp -> first jump , sp-> second jump , tp--> third jump
        int sp = BoardPath(num - 2, string + '2');
        int tp = BoardPath(num - 3, string + '3');
        return fp + sp + tp;
    }

    // Method 2 --> when the number of recurrsive call is more than 2 then we will
    // use the loop (sir ne loop me i ki jagah dice liya hai hamne mana hai yah pe
    // ki suppose die ke 3 face hai)
    public static int BoardPath_1(int num, String ans, int num1) {
        if (num == num1) {
            System.out.println(ans);
            return 1;
        }
        if (num1 > num) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            count += BoardPath_1(num, ans + i, num1 + i);
        }
        return count;
    }

}
