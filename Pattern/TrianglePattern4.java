package Pattern;
import java.util.*;
public class TrianglePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int star=1;
		while(i<=2*num-1) {
			int j=0;
			while(j<star) {
				System.out.print("*"+" ");
				j++;
			}
			
			if(i<num) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			i++;
		}
		
	}
}


