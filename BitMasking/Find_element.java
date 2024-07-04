import java.util.*;

public class Find_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Find_Element_Which_Is_SingleTime_Present(arr);
        System.out.println(res);
    }

    private static int Find_Element_Which_Is_SingleTime_Present(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
