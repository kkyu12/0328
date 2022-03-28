package Mar28th;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		if (text.contains("car")) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string.");
		}

		System.out.println(text);

	}

}
