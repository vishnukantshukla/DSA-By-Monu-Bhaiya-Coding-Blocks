package Backtracking.Lec6;

import java.util.*;

public class Queen_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        boolean board[] = new boolean[n];
        Board(board, q, 0, "");
    }

    public static void Board(boolean[] board, int tq, int qpsf, String ans) {

        // tq -- > total queen
        // qpsf-> queen place soo far
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        // for (int i = 0; i < board.length; i++) {
        // if (board[i] == false) {
        // board[i] = true;
        // qpsf+=1;
        // Board(board, tq, qpsf, ans + "b" + i + "q" + (qpsf-1) + " ");
        // qpsf-=1;
        // board[i] = false;
        // }
        // }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Board(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
                board[i] = false; // undo (Backtracking)
            }
        }
    }
}
