package chapter_02;
import java.util.Scanner;

public class Sections2_9Accelerarion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the starting velocity in meters/second: ");
		double velocity0 = input.nextDouble();
		
		System.out.print("Enter the ending velocity in meters/second: ");
		double velocity1 = input.nextDouble();
		
		System.out.print(" Enter the time span t in seconds: ");
		double timeSpan = input.nextDouble();
		
		double acceleration = (velocity1 - velocity0) / timeSpan;
		
		System.out.println(" The average acceleration is "  + acceleration );
		
	
	
	}

}
