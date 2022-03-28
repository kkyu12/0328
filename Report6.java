package Mar28th;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1;
		num1 = scanner.nextInt();
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				System.out.println(i);
			}
		}

	}

}
