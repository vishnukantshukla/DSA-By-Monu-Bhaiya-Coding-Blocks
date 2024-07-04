package Pattern;

import java.util.*;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			
				for (int j = num - 1; j >= i; j--) {
					System.out.print("  ");
				}
				for (int j = 0; j <=i; j++) {
					System.out.print(i+1 + " ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(i+1 + " ");
				}
				System.out.println();
			
		}
			

	}

}
