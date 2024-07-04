package Backtracking.Lec8;

import java.util.Scanner;

public class Rat_Chases_its_Cheese {
    static boolean f=false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] ch = new char[row][col];
        for (int i = 0; i < ch.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                ch[i][j] = s.charAt(j);
            }
        }
        int arr[][] = new int[row][col];
        PrintPath(ch, 0, 0, arr);
        if(f==false){
            System.out.println("NO PATH FOUND");
        }
    }

    private static void PrintPath(char[][] maze, int cr, int cc, int arr[][]) {
        if (cc == maze[0].length - 1 && cr == maze.length - 1) {
            if (maze[cr][cc] == '0') {
                f=true;
                arr[cr][cc] = 1;
                Display(arr);
                arr[cr][cc] = 0;
            }
            
            return;
        }
        if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }

        int r[] = { 0, -1, 0, 1 }; // row
        int c[] = { 1, 0, -1, 0 };// column
        // PrintPath(ch, row - 1, col, arr);
        // PrintPath(ch, row, col - 1, arr);
        // PrintPath(ch, row, col + 1, arr);
        // PrintPath(ch, row + 1, col, arr);
        maze[cr][cc] = 'X';
        arr[cr][cc] = 1;
        for (int i = 0; i < c.length; i++) {
            PrintPath(maze, cr + r[i], cc + c[i], arr);
        }
        maze[cr][cc] = '0';
        arr[cr][cc] = 0;
    }

    public static void Display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
