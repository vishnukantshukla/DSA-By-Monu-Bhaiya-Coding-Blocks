package Pattern;
import java.util.*;
public class Triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
					System.out.print("*"+" ");
					k++;
			}
			star+=2;
			space--;
			i++;
			System.out.println();
		}
	}

}
