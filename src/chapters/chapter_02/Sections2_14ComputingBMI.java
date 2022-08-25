package chapter_02;
import java.util.Scanner;

public class Sections2_14ComputingBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print(" Enter the height in inches: ");
		double height = input.nextDouble();
		
		double weightInKilograms = weight * 0.45359237;
		double heightInMeters = height * 0.0254;
		
//double BMI = weightInKilograms / Math.pow(heightInMeters, 2);		
	double BMI = (int)(weightInKilograms / Math.pow(heightInMeters, 2)*10000) /10000.0;
		
		System.out.println(" BMI is " + BMI);
		

	}
} 
