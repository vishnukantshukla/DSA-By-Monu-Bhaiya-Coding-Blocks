import java.util.*;

public class Trapping_rain_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        TrappingWater(arr);

    }

    private static void TrappingWater(int[] arr) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[right.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.print(sum);
    }
}
