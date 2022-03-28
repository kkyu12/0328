package Mar26th;

import java.util.Scanner;

public class Report8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int i;
		if (num1 > num2) {
			i = num2;
		} else {
			i = num1;
		}
		/*
		 * for (i = i; i >= 1; i--) { if (num1 % i == 0 && num2 % i == 0) {
		 * System.out.println(i); break; } }
		 */
		while (!(num1 % i == 0 && num2 % i == 0)) {
			i--;
		}
		System.out.println(i);

	}

}
