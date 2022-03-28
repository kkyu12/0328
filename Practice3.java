package Mar26th;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.print(num1 % 3);
		num1 = num1 / 3;
		System.out.print(num1 % 3);
		num1 = num1 / 3;
		System.out.print(num1 % 3);

	}

}
