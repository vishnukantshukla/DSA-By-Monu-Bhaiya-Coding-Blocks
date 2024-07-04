package Pattern;

import java.util.*;

public class Trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			
				for (int j = num - 1; j >= i; j--) {
					System.out.print("  ");
				}
				for (int j = 0; j <=i; j++) {
					System.out.print("*" + " ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*" + " ");
				}
				System.out.println();
			
		}
			

	}

}
