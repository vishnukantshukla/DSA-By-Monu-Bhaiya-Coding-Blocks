package Pattern;

import java.util.*;

public class Right_Triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 1;
		int star = 1;
		while (i <= row) {
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
			star++;
		}
	}

}
