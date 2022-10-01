package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class EXercise5_42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter commission sought: ");
		double commisionSought = input.nextDouble();

		double commision = 0;
		double sales = 30000;
		double salary = 5000;

		for (commision = 0, sales = commisionSought; commision + salary < commisionSought; sales += 0.1) {
			commision = 0;
			commision += 5000 * 0.08;
			commision += 5000 * 0.10;
			commision += (sales - 10000) * 0.12;

		}
		System.out.printf("\n\nYou'll need to make $%1.2f in sales.", sales);
	}
}