package Lec4;

import java.util.*;

public class MazePath_Diagonally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        MazePath_diagonally(row, col, 0, 0, "");
    }

    private static void MazePath_diagonally(int row, int col, int cr, int cc, String string) {
        if (row == cr && col == cc) {
            System.out.println(string);
            return;
        }
        if (cr >= row || cc >= col) {
            return;
        }
        MazePath_diagonally(row, col, cr, cc + 1, string + "H");
        MazePath_diagonally(row, col, cr + 1, cc, string + "V");
        MazePath_diagonally(row, col, cr + 1, cc + 1, string + "D");
    }
}
