package Mar28th;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		if (line.equals("hello")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		if (line.contains("hello")) {
			System.out.println("hello included");
		} else {
			System.out.println("hello not included");
		}

	}

}
