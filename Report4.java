package Mar28th;

import java.util.Scanner;

public class Report4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1, i, j, k;
		num1 = scanner.nextInt();
		k = num1;

		for (i = 1; i <= num1; i++) {
			for (j = k - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			k--;
		}

	}

}
