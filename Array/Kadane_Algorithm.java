import java.util.*;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = KadanesAlgo(arr); // it is basically used when we want to find the maximum sum of the sum
                                    // array.....
        System.out.println(res);
    }

    private static int KadanesAlgo(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {            // yeh yesliys kara hai jisse ham maximum sub sum nikl ske koyki agar ham negative number me positive add kare gye to bo to posyive se kam hii rahega too ham positive number ko jis indexpe number positive hai
                sum = 0;
            }
        }
        return sum;
    }
}
