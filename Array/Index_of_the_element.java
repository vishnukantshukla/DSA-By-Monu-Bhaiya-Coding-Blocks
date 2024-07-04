import java.util.*;
public class Index_of_the_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=Index(arr,target);
        System.out.println(res);
    }
    public static int Index(int [] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
