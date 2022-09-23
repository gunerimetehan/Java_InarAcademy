package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines(1-15): ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			// for(int j = n; j > i; j--)
			for (int j = i; j <= (n - 1); j++) {
				System.out.printf("%3s", "");
			}

			for (int j = i; j > 0; j--) {
				System.out.printf("%3d", j);
			}

			for (int j = 2; j <= i; j++) {
				System.out.printf("%3d", j);
			}

			System.out.println();

		}

	}
}