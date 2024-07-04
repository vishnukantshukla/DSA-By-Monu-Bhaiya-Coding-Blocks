package Lec2;
import java.util.*;
public class Print_Nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
//		System.out.print(a+" ");
		int b=1;
//		System.out.println(b+" ");
		for(int i=0;i<num;i++) {
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a);
	}

}
