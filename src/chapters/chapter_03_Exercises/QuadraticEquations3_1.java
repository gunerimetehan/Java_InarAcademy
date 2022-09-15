package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class QuadraticEquations3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" for finding the roots of 'ax^2+bx+c=0' equation please enter values for a, b and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		if (discriminant == 0) {
			double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			System.out.println(" the equation has one root and it is " + r1);
		}
		else if(discriminant > 0) {
		double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;	 	
		 System.out.println(" the equation has two roots and the roots are " +r1 + "," + r2 );
		}
		else 
			System.out.println(" The equation has no real roots");
	}
}
