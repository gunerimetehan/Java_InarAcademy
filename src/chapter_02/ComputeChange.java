package chapter_02;
import java.util.Scanner;

public class ComputeChange {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter an amount as a decimal, e.g 11.56 : ");
	double amount = input.nextDouble();
	
	int amountInCents = (int)(amount*100);
	
	int numberOfDollars = amountInCents / 100;
	
	amountInCents = amountInCents % 100;
	
	int numberOfQuarters= amountInCents / 25;
	
	amountInCents = amountInCents % 25;
	
	int numberOfDimes = amountInCents / 10;
	
	amountInCents = amountInCents %10;
	
	int numberOfNickels = amountInCents / 5;
	amountInCents= amountInCents % 5;
	
	int pennies = amountInCents;
	
	System.out.println(" The amount " + amount + " consists of " + numberOfDollars + " Dollars " + numberOfQuarters + " quarters " + numberOfDimes + " dimes " + numberOfNickels + " nickels " + pennies + " pennies ");
	
	
}
}
