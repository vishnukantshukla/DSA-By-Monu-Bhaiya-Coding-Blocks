package Lec2;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String st="";
		st+=num;
		int len=st.length();
		int ans=0;
		int mul=1;
		while(len>1) {
			mul*=10;
			len--;
		}
		while(num>0) {
			int rem=num%10;
			ans+=rem*mul;
			num/=10;
			mul/=10;
		}
		System.out.println(ans);
		
		
	}

}
