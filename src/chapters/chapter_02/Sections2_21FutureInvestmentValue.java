package chapter_02;
import java.util.Scanner;

public class Sections2_21FutureInvestmentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter investment amount, annual interest rate in percentage and number of years in order: ");
		double InvestmentAmount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double numberOfYears = input.nextDouble();
		
		double futureInvestmentValue = InvestmentAmount * Math.pow(1 +annualInterestRate/1200, numberOfYears*12);
		System.out.println(" Accumulated value is " + futureInvestmentValue );
		
	}
}
