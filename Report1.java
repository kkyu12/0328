package Mar26th;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if (num1 > 1 && num1 < 10) {
			for (int i = 2; i < 10; i++) {
				System.out.println(num1 + " X " + i + " = " + num1 * i);
			}
		} else {
			System.out.println("Error");
		}
		
		/*
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		*/

	}

}
