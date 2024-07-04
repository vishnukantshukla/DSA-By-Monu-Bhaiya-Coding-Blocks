package Backtracking.Lec10;

import java.util.*;

public class Sudoku_Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        SudokuSolver(grid, 0, 0);
    }

    private static void SudokuSolver(int[][] grid, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            Display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            SudokuSolver(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isitpossible(grid, row, col, val) == true) {
                    grid[row][col] = val;
                    SudokuSolver(grid, row, col + 1);
                    grid[row][col] = 0; // undo (yesme agar ban gya hoga to ham usse base case me print kar denge ) &(
                                        // yah pe hamne undo yesliya kara hai koyki agar number fit nhi hua sudoku me to
                                        // backtrack karna hoga)
                }
            }
        }
    }

    private static boolean isitpossible(int[][] grid, int row, int col, int val) {
        // ham yah pe column me check karege ki element bha pe present hai
        int c = 0;

        while (c < 9) {
            if (grid[row][c] == val) {
                return false;
            }
            c++;
        }
        // row me check karege ki element to nhi hai bha pe
        int r = 0;
        while (r < 9) {
            if (grid[r][col] == val) {
                return false;
            }
            r++;
        }
        r = row - row % 3;
        c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
