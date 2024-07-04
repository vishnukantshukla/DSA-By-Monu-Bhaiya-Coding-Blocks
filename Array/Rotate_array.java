import java.util.*;

public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % arr.length;
        for (int j = 1; j <= k; j++) {
            RotateArray(arr, k);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void RotateArray(int[] arr, int k) {
        int a = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;

    }

}
