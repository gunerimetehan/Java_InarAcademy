package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter 10 numbers");
		final int n = 10;
		double total = 0;
		double mean = 0;
		double deviation = 0;
		double squareTotal = 0;
		for (int i = 1; i <= n; i++) {
			double numbers = input.nextDouble();
			total += numbers;
			mean = total / i;
			squareTotal += Math.pow(numbers, 2);

		}
		deviation = Math.sqrt((squareTotal - Math.pow(total, 2) / n) / (n - 1));
		System.out.println(mean);
		System.out.println(deviation);

	}

}
