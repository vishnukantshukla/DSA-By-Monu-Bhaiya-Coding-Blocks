package SlidingWindow;

public class Product_less_then_k {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,2,3};
      int k=10;
      System.out.println(countofSubarray(arr, k));

    }
    public static int countofSubarray(int arr[] , int k ){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
            //window grow
            p=p*arr[ei];

            //window small
            while(p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }


            //ans calculate
            ans=ans+ ei-si+1;
            ei++;
        }
        return ans;
    }
}
