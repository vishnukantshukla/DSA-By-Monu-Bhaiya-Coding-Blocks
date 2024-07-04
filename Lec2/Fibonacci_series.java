package Lec2;

import java.util.*;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		System.out.print(a + " ");
		int b = 1;
		System.out.print(b + " ");

		for (int i = 0; i < num - 2; i++) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
	}

}
