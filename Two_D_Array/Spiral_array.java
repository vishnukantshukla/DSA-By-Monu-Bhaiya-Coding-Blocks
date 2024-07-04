package Two_D_Array;

import java.util.*;

public class Spiral_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        RotateArray(arr);
    }

    private static void RotateArray(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while (count < total) {

            for (int i = minc; i <= maxc && count<total; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count<total; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count<total; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}
