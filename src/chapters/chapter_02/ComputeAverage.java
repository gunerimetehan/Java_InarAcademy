package chapter_02;
import java.util.Scanner;
public class ComputeAverage {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter 3 numbers: ");
	double number1 =input.nextDouble();
	double number2 =input.nextDouble();
	double number3 =input.nextDouble();
	
	double average = (number1 + number2 + number3) / 3;
	
	System.out.println("The average of numbers " + number1 + " and " + number2 + " and " + number3 + " is: " + average);
}
}
