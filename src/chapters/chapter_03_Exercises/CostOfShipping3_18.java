package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class CostOfShipping3_18 {
	public static void main(String args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the weight of the package in pounds: ");
		double weight = input.nextDouble();
		input.close();
		
		if (weight <= 1)
			System.out.println(" The shopping cost is 3.5 dollars" );
		else if (weight <= 3)
			System.out.println(" The shopping cost is 5.5 dollars" );
		else if (weight <= 10)
			System.out.println(" The shopping cost is 8.5 dollars" );
		else if (weight <= 20)
			System.out.println(" The shopping cost is 10.5 dollars" );
		else
			System.out.println(" The package can not be shipped ");

	}

}
