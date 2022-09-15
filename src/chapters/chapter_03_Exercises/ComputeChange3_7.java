package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class ComputeChange3_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter an amount as a decimal, e.g 11.56 : ");
		double amount = input.nextDouble();
		
		int amountInCents = (int)(amount*100);
		
		int numberOfDollars = amountInCents / 100;
		if (numberOfDollars == 1) {
			System.out.println(numberOfDollars +" dollar ");
		}
		else if(numberOfDollars > 1) {
			System.out.println(numberOfDollars + " dollars");
		}
		
		amountInCents = amountInCents % 100;
		
		int numberOfQuarters= amountInCents / 25;
		
		if (numberOfQuarters == 1)
			System.out.println(numberOfQuarters + " quarter");
		else if (numberOfQuarters > 1)
			System.out.println(numberOfQuarters + " quarters");
		
		amountInCents = amountInCents % 25;
		
		int numberOfDimes = amountInCents / 10;
		
		if (numberOfDimes == 1)
			System.out.println( numberOfDimes + " dime ");
		else if (numberOfDimes > 1)
			System.out.println(numberOfDimes + " dimes ");
		
		amountInCents = amountInCents %10;
		
		int numberOfNickels = amountInCents / 5;
		
		if (numberOfNickels == 1)
			System.out.println(numberOfNickels + " nickel");
		else if (numberOfNickels > 1)
			System.out.println(numberOfNickels + " nickels ");
		
		
		amountInCents= amountInCents % 5;
		
		int pennies = amountInCents;
		
		if (pennies == 1 )
			System.out.println(pennies + " penny");
		else if (pennies > 1)
			System.out.println(pennies + " pennies");
		
		

		
	}
	}



