package Lec2;
import java.util.*;
public class reverse_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		String st="";
		st+=num;
		String st1="";
		for(int i=st.length()-1;i>=0;i--) {
			st1+=st.charAt(i);
		}
		System.out.println(Long.parseLong(st1));
	}

}
