package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount,annual interest rate and number of months ");
		double amount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		int numberOfMonths = input.nextInt();
		input.close();
		double monthlyInterest = annualInterestRate / 1200;

		System.out.printf("%-10s %10s", "Month", "CD Value");
		for (int i = 1; i <= numberOfMonths; i++) {
			amount *= (1 + monthlyInterest);
			System.out.printf("%-10d %10.2f\n", i, amount);
		}
	}
}