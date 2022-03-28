package Mar28th;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		// text = text.toUpperCase();
		// if (text.equalsIgnoreCase(text)
		/*
		 * if (text.contains("car")) {
		 * System.out.println("car is included in the input string."); } else {
		 * System.out.println("car is not included in the input string."); }
		 */

		System.out.println(text);

		if (text.toUpperCase().contains("CAR") || text.toLowerCase().contains("car")) {
			System.out.println("CAR is include");
		} else {
			System.out.println("not include");
		}

	}

}
