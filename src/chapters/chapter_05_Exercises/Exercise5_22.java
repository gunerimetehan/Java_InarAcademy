package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print(" number of years: ");
		int numberOfYears = input.nextInt();

		System.out.print(" Annual interest Rate: ");
		double annualInterestRate = input.nextDouble();
		input.close();
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = (loanAmount * monthlyInterestRate)
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		double balance = totalPayment;
		double interest, principal;
		System.out.printf("Monthly Payment: %3.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);
		System.out.println("Payment#	Interest	Principal	Balance\n");

		for (int i = 1; i <= (numberOfYears * 12); i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			if (i == numberOfYears * 12) {
				principal += balance;
			}
			System.out.printf("%-3d %3.2d %3.2d %3.2d", i, interest, principal, balance);
		}
	}
}