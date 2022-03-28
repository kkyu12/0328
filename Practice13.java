package Mar28th;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			System.out.println("One!");
			break;
		case 2:
			System.out.println("Two!");
			break;
		default:// ==else
			System.out.println("Except 1, 2");
			break;

		}

	}

}
