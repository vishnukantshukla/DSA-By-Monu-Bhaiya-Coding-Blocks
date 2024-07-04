package Pattern;
import java.util.*;
public class TrianglePattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		int space=num-1;
		int star=num;
		while(i<2*num-1) {
			int j=0;
			while(j<space) {
				System.out.print("     ");
				j++;
			}
			int k=0;
			while(k<star) {
				System.out.print("*"+"    ");
				k++;
			}
			i++;
			if(i<num) {
				star--;
				space--;
			}
			else {
				star++;
				space++;
			}
			
			System.out.println();
			
		}
	}

}
