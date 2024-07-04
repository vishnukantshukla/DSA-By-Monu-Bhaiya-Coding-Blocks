package Lec2;
import java.util.*;
public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int row=0;
		int star=0;
		while(row<num) {
			int i=0;
			int val=1;
			while(i<=star) {
				System.out.print(val+"\t");
				val=((row-i)  * val) /  (i+1);
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}

}
