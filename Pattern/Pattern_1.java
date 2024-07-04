package Pattern;

import java.util.*;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 0;
		int star = row;
		int space = 0;
		while (i < row) {
			int j = 0;
			while (j < space) {
				System.out.print("   "+"  ");
				j++;
			}
			int k = 0;
			while (k < star) {
				System.out.print(" * " + " ");
				k++;
			}
			System.out.println();
			star--;
			i++;
			space += 2;
		}
	}

}
