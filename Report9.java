package Mar28th;

import java.util.Scanner;

public class Report9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= num1; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
			count = 0;
		}

	}

}
