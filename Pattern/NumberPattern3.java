package Pattern;
import java.util.*;
public class NumberPattern3 {

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
				System.out.print("\t");
				j++;
			}
			int k=1;
			int val=i+1;
			while(k<=star) {
					
					System.out.print(val+"\t");
					k++;
					if(k<=(star/2)+1) {
						val++;
					}
					else {
						val--;
					}
					
			}
			star+=2;
			space--;
			i++;
			System.out.println();
		}
	}

}
