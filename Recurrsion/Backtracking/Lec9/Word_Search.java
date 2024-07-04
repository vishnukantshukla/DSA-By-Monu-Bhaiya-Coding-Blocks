package Backtracking.Lec9;

import java.util.*;

public class Word_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] maze = new char[row][col];
        for (int i = 0; i < maze.length; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j] = str.charAt(j);
            }
        }
        String target = sc.next();
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] != target.charAt(0)) {
                    continue;
                } else {
                    boolean res = WordSearch(maze, i, j, target, 0);
                    if (res == true) {
                        System.out.println(true);
                        break;
                    }
                }
            }
        }
        System.out.println(false);

    }

    public static boolean WordSearch(char[][] maze, int cr, int cc, String target, int indx) {
        if (indx == target.length()) {
            return true;
        }
        if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] != target.charAt(indx)) {
            return false;
        }
        int r[] = { -1, 1, 0, 0 };
        int c[] = { 0, 0, -1, 1 };
        char st = maze[cr][cc];
        maze[cr][cc] = '*';
        for (int i = 0; i < c.length; i++) {

            boolean ans = WordSearch(maze, cr + r[i], cc + c[i], target, indx + 1);
            if (ans == true) {
                return ans;
            }
        }
        maze[cr][cc] = target.charAt(indx);
        return false;
    }
}
