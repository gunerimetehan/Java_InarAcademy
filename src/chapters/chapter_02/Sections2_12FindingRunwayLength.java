package chapter_02;
import java.util.Scanner;

public class Sections2_12FindingRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter speed v in meters/second: ");
		double speed = input.nextDouble();
		
		System.out.print(" Enter acceleration a in meters/second: ");
		double acceleration = input.nextDouble();
		
		double length = Math.pow(speed, 2) / (2 * acceleration);
		//double length = speed * speed / (2 * acceleration);

		System.out.println( " The minimum runway length for this airplane is " + length);
	}

}
