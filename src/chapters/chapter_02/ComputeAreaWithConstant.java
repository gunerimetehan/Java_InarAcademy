package chapter_02;
import java.util.Scanner;

public class ComputeAreaWithConstant {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );
		
		final double PI = 3.14159;
		
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * PI;
		
		System.out.println("The area of a circle for radius " +radius + " is " +area);
		
	}

}
