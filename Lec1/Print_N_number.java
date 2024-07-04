package Lec1;
import java.util.Scanner;
public class Print_N_number {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		int num=sc.nextInt();
		while(i<=num) {
			System.out.print(i+ " ");
			i+=1;
		}
	
	}

}
