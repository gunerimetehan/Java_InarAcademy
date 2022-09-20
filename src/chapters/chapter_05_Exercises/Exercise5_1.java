package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an integer: ");
		int number = input.nextInt();

		float avg = 0;
		int countPos = 0;
		int countNeg = 0;
		float total = 0;
		if (number == 0) {
			System.out.println(" No numbers entered except 0");
			System.exit(1);
		}
		while (number != 0) {
			if (number > 0) {
				countPos++;
			} else {
				countNeg++;
			}
			total += number;
			avg = total / (countPos + countNeg);
			System.out.print(" Enter an integer: ");
			number = input.nextInt();
		}
		System.out.println(" The number of positives\n" + countPos);
		System.out.println(" The number of negatives\n" + countNeg);
		System.out.printf(" The average is %.2f\n", avg);
		System.out.println(" The total is\n" + total);

	}

}
