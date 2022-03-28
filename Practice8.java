package Mar28th;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What operation do you want?");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("--->");
		int oper = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if (oper == 1) {
			System.out.println(num1 + num2);
		} else if (oper == 2) {
			System.out.println(num1 - num2);
		} else if (oper == 3) {
			System.out.println(num1 * num2);
		} else if (oper == 4 && num2 != 0) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Error");
		}

	}

}
