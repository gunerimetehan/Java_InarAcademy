package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount,annual interest rate and number of months ");
		double amount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		int numberOfMonths = input.nextInt();
		input.close();

		double monthlyInterest = annualInterestRate / 1200;
		double amountInSaving = 0;
		
		for (int i = 1; i <= numberOfMonths; i++) {
			amountInSaving = (amountInSaving + amount) * (1 + monthlyInterest);

		}
		System.out.println("The amount in the saving account is" + amountInSaving);
	}

}
