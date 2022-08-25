package chapters.chapter_03;
import java.util.Scanner;

public class ComputingBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		if (weight <= 0) {
			System.out.println(" Weight must be a positive number");
			return  ;
		}
		System.out.print(" Enter height in inches: ");
		double height = input.nextDouble();
		
		if (height <= 0) {
			System.out.println(" Height must be a positive number");
		return;
	}
		weight = weight * 0.45359237;
		height = height * 0.0254;
		//System.out.println(weight +" and " + height);
		
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
