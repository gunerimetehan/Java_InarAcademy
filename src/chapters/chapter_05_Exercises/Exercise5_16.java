package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an integer");
		int number = input.nextInt();
		input.close();

		int factors = 2;

		while (number > 1) {
			if (number % factors == 0) {
				number = number / factors;

				if (number == 1) {
					System.out.println(factors);
				} else {
					System.out.print(factors + " ");
					continue;
				}
			}
			factors++;

		}
	}
}
