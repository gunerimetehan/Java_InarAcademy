package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class ComputingBMI3_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print(" Enter height in feet: ");
		double feet = input.nextDouble();
		
		System.out.print(" Enter height in inches: ");
		double inches = input.nextDouble();
		
		
		double height = (12 * feet + inches)* 0.0254;
		weight =  weight * 0.45359237;
		
		double BMI = weight /( Math.pow(height, 2));
		System.out.println( " BMI is " + BMI);
		
		if ( BMI < 18.5 )
			System.out.println("Underweight");
		else if ( BMI < 25.0)
			System.out.println(" Normal");
		else if ( BMI < 30.0)
			System.out.println(" Overweeight");
		else
			System.out.println(" Obese ");
	}

}
