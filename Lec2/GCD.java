package Lec2;
import java.util.*;
public class GCD{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divident=sc.nextInt();
		int divisior=sc.nextInt();
		while(divident%divisior!=0) {
			int rem=divident%divisior;
			divident=divisior;
			divisior=rem;
		}
		System.out.println(divisior);
	}

}
