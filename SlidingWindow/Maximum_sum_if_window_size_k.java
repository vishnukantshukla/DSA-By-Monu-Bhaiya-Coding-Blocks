package SlidingWindow;

public class Maximum_sum_if_window_size_k {
    public static void main(String[] args) {
        int arr[]={1,2,7,5,11,3,2,1};
        int k=3;
    }
    public static int MaximumSum(int []arr,int k ){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int ans=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]; //window grow ho rha hai
            sum-=arr[i-k];   // window small ho raha hai
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}

