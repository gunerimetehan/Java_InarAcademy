package chapter_02;
import java.util.Scanner;

public class Sections2_13CompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the monthly saving amount: ");
		double monthlySavingAmount = input.nextDouble();
		
		double monthlyInterestRate = 0.00417;
		double firstMonthAmount = monthlySavingAmount * (1 + monthlyInterestRate );
		double secondMonthAmount = (monthlySavingAmount + firstMonthAmount) * (1 + monthlyInterestRate);
		double thirdMonthAmount = (monthlySavingAmount + secondMonthAmount) * (1 + monthlyInterestRate);
		double fourthMonthAmount = (monthlySavingAmount + thirdMonthAmount) * (1 + monthlyInterestRate);
		double fifthMonthAmount = (monthlySavingAmount + fourthMonthAmount) * (1 + monthlyInterestRate);
		double sixthMonthAmount = (monthlySavingAmount + fifthMonthAmount) * (1 + monthlyInterestRate);
		
		System.out.println(" After the six months the account value is " + sixthMonthAmount);

		
		
	}

}
