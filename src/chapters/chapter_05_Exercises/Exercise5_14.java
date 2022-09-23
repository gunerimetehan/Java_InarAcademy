package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter two integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int smallest;

		for (smallest = Math.min(n1, n2); smallest > 1; smallest--) {
			if (n1 % smallest == 0 && n2 % smallest == 0) {
				break;
			}
		}
		if (smallest == 1) {
			System.out.println(n1 + " and " + n2 + " are  relatively prime numbers");
		} else {
			System.out.println("GCD is " + smallest);
		}

	}
}