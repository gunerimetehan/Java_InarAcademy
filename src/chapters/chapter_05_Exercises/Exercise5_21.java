package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print(" number of years: ");
		int numberOfYears = input.nextInt();
		input.close();
		System.out.println("InterestRate     Monthly Payment     Total Payment");

		for (double interestRate = 5.000; interestRate <= 8.0; interestRate += 0.125) {

			double monthlyInterestRate = interestRate / 1200;
			double monthlyPayment = (loanAmount * monthlyInterestRate)
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;

			System.out.printf("%-3.3f %3.2d %3.2d", interestRate, monthlyPayment, totalPayment);

		}
	}

}
