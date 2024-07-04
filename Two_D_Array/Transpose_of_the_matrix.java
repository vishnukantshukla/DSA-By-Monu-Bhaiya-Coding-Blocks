package Two_D_Array;

import java.util.*;

public class Transpose_of_the_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        Transpose(arr);
    }

    // Method 1  --> is to transpose the the matrix

    // public static void Transpose(int[][] arr) {
    // for (int row = 0; row < arr.length; row++) {
    // for (int column = 0; column < arr[row].length; column++) {
    // System.out.print(arr[column][row] + " ");
    // }
    // System.out.println();
    // }
    // }

    // Method 2 --> it is the 2nd method to transpose the matrix
    public static void Transpose(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = row + 1; column < arr[row].length; column++) {
                int temp = arr[row][column];
                arr[row][column] = arr[column][row];
                arr[column][row] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
