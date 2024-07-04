package Lec4;

import java.util.*;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        PrintPath(row - 1, column - 1, 0, 0, "");

    }

    private static void PrintPath(int er, int ec, int cr, int cc, String ans) {
        // ec--> end column , er--> end column , cr--> current row , cc--> current
        // column
        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        PrintPath(er, ec, cr, cc + 1, ans + "H");
        PrintPath(er, ec, cr + 1, cc, ans + "V");
    }
}
