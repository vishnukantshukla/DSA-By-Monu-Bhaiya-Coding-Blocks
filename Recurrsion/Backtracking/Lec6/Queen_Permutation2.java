package Backtracking.Lec6;

import java.util.*;

public class Queen_Permutation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // yeh basically hame size batata hai
        int tq = sc.nextInt(); // yeh basically hame ketni queen hai yeh batayea ga
        boolean[] board = new boolean[num];
        Board(board, tq, 0, "", 0);
    }

    public static void Board(boolean[] board, int tq, int qpsf, String ans, int indx) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = indx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Board(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ", i + 1);
                board[i] = false;
            }

        }
    }

}
