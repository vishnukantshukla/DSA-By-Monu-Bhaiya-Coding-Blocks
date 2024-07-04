import java.util.*;

public class Product_of_array_except_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ProductExeptItself(arr);
    }

    private static void ProductExeptItself(int[] arr) {
        int left[] = new int[arr.length];
        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        int right[] = new int[arr.length];
        right[right.length - 1] = 1;
        for (int j = arr.length - 2; j >= 0; j--) {
            right[j] = right[j + 1] * arr[j + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            left[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(left));
    }
}
