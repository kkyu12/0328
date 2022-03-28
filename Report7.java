package Mar28th;

import java.util.Scanner;

public class Report7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int i = 1;
		/*
		 * for (i=1;i<=num1*num2;i++) { if (i%num1==0 && i%num2==0) {
		 * System.out.println(i); break; } }
		 */
		while (!(i % num1 == 0 && i % num2 == 0)) {
			i++;
		}
		System.out.println(i);

	}

}
