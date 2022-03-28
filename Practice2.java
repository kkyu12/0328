package Mar26th;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = num1 - num2;
		System.out.println(num3);
		System.out.println("10000 - " + num3 / 10000);
		num3 = num3 % 10000;
		System.out.println("5000 - " + num3 / 5000);
		num3 = num3 % 5000;
		System.out.println("1000 - " + num3 / 1000);
		num3 = num3 % 1000;
		System.out.println("500 - " + num3 / 500);
		num3 = num3 % 500;
		System.out.println("100 - " + num3 / 100);
		num3 = num3 % 100;
		System.out.println("50 - " + num3 / 50);
		num3 = num3 % 50;
		System.out.println("10 - " + num3 / 10);

	}

}
