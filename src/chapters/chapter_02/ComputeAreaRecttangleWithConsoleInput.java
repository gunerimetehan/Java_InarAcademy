package chapter_02;
import java.util.Scanner;

public class ComputeAreaRecttangleWithConsoleInput {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number for height: ");
	double height = input.nextDouble();
	
	System.out.print("Enter a number for width: ");
	double width = input.nextDouble();
	
	double area = height * width;
	
	System.out.println("The area of a rectangle for height " + height + " and width " + width + " is " + area);
}
}
