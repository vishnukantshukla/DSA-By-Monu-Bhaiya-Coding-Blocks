package Lec2;
import java.util.*;
public class Digit_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int n=sc.nextInt();n>0;n/=10) {
			sum+=n%10;
		}
		System.out.println(sum);
		
	}

}
