package Pattern;

import java.util.*;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 0;
		while (i < row) {
			int j = 0;
			while (j < row) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
