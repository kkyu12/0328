package Mar26th;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1, i, j, k;
		num1 = scanner.nextInt();
		k = 0;
		for (i = num1; i > 0; i--) {
			for (j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
	}

}
