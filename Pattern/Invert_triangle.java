package Pattern;

import java.util.*;

public class Invert_triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 1, star = row;
		while (i <= row) {
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
			star--;
		}
	}

}
