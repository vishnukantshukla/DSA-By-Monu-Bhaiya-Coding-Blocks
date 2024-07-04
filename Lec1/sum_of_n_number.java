package Lec1;
import java.util.*;
public class sum_of_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
