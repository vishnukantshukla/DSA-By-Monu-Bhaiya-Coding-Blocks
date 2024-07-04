import java.util.*;
public class Minimum_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        MinValue(arr);
    }
    public static void MinValue(int[] arr){
         int num=arr[0];
            for(int k=0;k<arr.length;k++){
            if(arr[k]<num){
                num=arr[k];
            }
        }
        System.out.println(num);
    
    }
}
