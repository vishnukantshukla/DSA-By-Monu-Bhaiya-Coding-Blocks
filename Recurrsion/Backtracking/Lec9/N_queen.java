package Backtracking.Lec9;

import java.util.*;

public class N_queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        PrintPath(board, 0, n);
    }

    public static void PrintPath(boolean[][] board, int row, int tq) {
        if (tq == 0) {
            Display(board);
            return;
        }
        if (row == board.length) {
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isitpossible(board, row, col) == true) {
                board[row][col] = true;
                PrintPath(board, row + 1, tq - 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isitpossible(boolean[][] board, int row, int col) {

        // upper case
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // left diagonal

        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        // right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            c++;
            r--;
        }
        return true;
    }

    private static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************************************");
    }
}
