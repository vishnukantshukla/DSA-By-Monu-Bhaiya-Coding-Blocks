package Pattern;

import java.util.*;

public class square_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("*"+" ");
					i=i+1;
				}
			}
			else {
				System.out.print("*"+" ");
				int i=1;
				while(i<=n-2) {
					System.out.print("  ");
					i=i+1;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
			row=row+1;
		
		}
	}

}
