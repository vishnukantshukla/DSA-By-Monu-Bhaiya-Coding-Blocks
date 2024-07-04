package Two_D_Array;

import java.util.*;

public class Search_in_2D_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int target = sc.nextInt();

        // method1 -->1 call

        // Search_in_2D(arr, target);

        // method2 -->2 call

        // if (Search_in_2D_method_2(arr, target)) {
        // System.out.println("Elemet found in 2D matrix");
        // } else {
        // System.out.println("0");
        // }

        // method3-->call
        // String st = Search_in_2D_method_3(arr, target);
        // System.out.println(st);

        // System.out.println(Search_in_2D_method_3(arr, target));

        // method 4--> Optised code
        if (Search_in_2D_method_4(arr, target) == 1) {
            System.out.println("Element found in 2D matrix");
        } else {
            System.out.println("Element not found");
        }
    }

    // method --> 1
    private static void Search_in_2D(int[][] arr, int target) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found++;
                    break;
                }

            }
            if (found >= 1) {
                break;
            }

        }
        if (found == 1) {
            System.out.println("Element found in 2D matrix");
        } else {
            System.out.println("0");
        }

    }

    // method2 -->
    private static boolean Search_in_2D_method_2(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }

        }
        return false;
    }

    // method -->3
    private static String Search_in_2D_method_3(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return "Element found in the 2D matrix";
                }
            }

        }
        return "0";
    }
 
    // method-->4  this code is applicable when all the row of 2D matrix in sorted 
    private static int Search_in_2D_method_4(int[][] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j && j >= 0) {
            if (arr[i][j] == target) {
                return 1;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }

}
