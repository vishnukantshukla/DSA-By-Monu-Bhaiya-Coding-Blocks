package Pattern;

import java.util.*;

public class NumberPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k=1;
		for (int i = 0; i < num; i++) {
			
				for (int j = num - 1; j >= i; j--) {
					System.out.print("\t");
				}
				for (int j = 0; j <=i; j++) {
					System.out.print(k + "\t");
					k+=1;
				}
				for (int j = 0; j < i; j++) {
					System.out.print(k + "\t");
					k++;
				}
				System.out.println();
			
		}
			

	}

}
