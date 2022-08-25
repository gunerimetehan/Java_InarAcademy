package chapter_02;
import java.util.Scanner;

public class Sections2_20CalculateInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter balance and interest rate (e.g. 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
	
		double interest = (int)(100000*balance * annualInterestRate/1200) /100000.0;
		
		System.out.println(" the interest is " + interest);
		
	}

}
