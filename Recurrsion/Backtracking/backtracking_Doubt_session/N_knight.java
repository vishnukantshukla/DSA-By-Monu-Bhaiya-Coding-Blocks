package Backtracking.backtracking_Doubt_session;

import java.util.*;

public class N_knight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        // knight --> 2.5 chal(step )chalta hai paar ham pure block ko consider
        // karege...
        int res = knight(board, 0, 0, "", n);
        System.out.println("\n" + res);
    }

    public static int knight(boolean board[][], int row, int col, String ans, int tn) {
        if (tn == 0) {
            System.out.print(ans + "  ");
            return 1;
        }
        if (col == board.length) {
            row++;
            col = 0;
        }
        if (row == board.length) {
            return 0;
        }
        int count = 0;
        // yes
        if (isitsafe(board, row, col)) {
            board[row][col] = true;
            count += knight(board, row, col + 1, ans + "{" + row + "-" + col + "} ", tn - 1);
            board[row][col] = false;
        }
        // no
        count += knight(board, row, col + 1, ans, tn);
        return count;
    }

    private static boolean isitsafe(boolean[][] board, int row, int col) {
        int[] r = { -1, -1, -2, -2 };
        int[] c = { 2, -2, 2, -1 };
        for (int i = 0; i < c.length; i++) {
            int x = row + r[i];
            int y = col + c[i];
            if (x >= 0 && y >= 0 && y < board.length && board[x][y] == true) {
                return false;
            }
        }
        return true;
    }
}
