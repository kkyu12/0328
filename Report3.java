package Mar26th;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
