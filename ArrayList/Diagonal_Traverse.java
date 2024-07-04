package ArrayList;


import java.util.*;
public class Diagonal_Traverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[sc.nextInt()][sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        FindDiagoonal(arr);   //number of diagonal --> n+m-1
    }

    private static void FindDiagoonal(int[][] arr) {
        int n=arr.length;
        int i=0;
        int m=arr[0].length;
        int[] ans=new int[n*m];
        for(int d=0;d<n+m-1;d++){
            int r=0;
            int c=0;
            if(d<m ){
                r=0;
                c=d;
            }
            else{
                r=d-m+1;       //d-m+1 yeh starting point kha se hai yeh batayega broo
                c=m-1;
            }
            ArrayList<Integer> list=new ArrayList<>();
            while(r<n && c>=0){
                list.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){

                Collections.reverse(list);
            }
            for(int val :list){
                ans[i]=val;
                i++;
            }
        }
    }
}
