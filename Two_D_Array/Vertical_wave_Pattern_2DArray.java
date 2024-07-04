package Two_D_Array;

import java.util.*;

public class Vertical_wave_Pattern_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int Col = sc.nextInt();
        int arr[][] = new int[row][Col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Pattern(arr);
    }

    private static void Pattern(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }

            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

            System.out.println();
        }
    }
}
