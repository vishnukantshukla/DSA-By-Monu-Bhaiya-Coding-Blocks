package Pattern;
import java.util.*;
public class TrianglePattern_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
					System.out.print("!"+" ");
				}
				
				k++;
			}
			star+=2;
			space--;
			i++;
			System.out.println();
		}
	}

}
