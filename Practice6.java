package Mar28th;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 3;
		j = 5;

		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is greater than i or j and i are the same");
		}

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if (num1 == 1) {
			System.out.println("One!");
		} else {
			System.out.println("Not One!");
		}
	}

}
