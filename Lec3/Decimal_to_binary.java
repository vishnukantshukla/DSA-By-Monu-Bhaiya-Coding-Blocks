package Lec3;
import java.util.*;
public class Decimal_to_binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int mul=1;
		while(num>0) {
			int rem=num%2;
			sum+=rem*mul;
			num/=2;
			mul*=10;
		}
		System.out.println(sum);

	}

}
