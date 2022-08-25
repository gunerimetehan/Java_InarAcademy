package chapter_02;
import java.util.Scanner;

public class Sections2_22ComputeChange {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter an integer whoose last two digits represent the cents : ");
	int amount = input.nextInt();
	
	int numberOfDollars = amount / 100;
	int numberOfCents = amount %100;
	
	System.out.println(" the amount consists of " + numberOfDollars + " dollars and " + numberOfCents + " cents ");
	


}
}
