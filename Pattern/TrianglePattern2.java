package Pattern;

import java.util.*;

public class TrianglePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int i=0;
		int space=row-1;
		int star=1;
		while(i<row) {
			int j=0;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			int k=0;
			while(k<star) {
				if(k%2==0) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
				
				k++;
			}
			System.out.println();
			i++;
			star=star+2;
			space--;
		}
		
	}

}
