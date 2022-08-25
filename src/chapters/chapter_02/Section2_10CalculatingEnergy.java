package chapter_02;

import java.util.Scanner;

public class Section2_10CalculatingEnergy {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the amount of water in kilograms: ");
	double amountOfWater = input.nextDouble();
	
	System.out.print("Enter the initial temperature in Celsius: ");
	double InitialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature in Celsius: ");
	double finalTemperature = input.nextDouble();
	
	double energyNeeded = amountOfWater * (finalTemperature - InitialTemperature) * 4184;
	
	System.out.println("The energy needed is " + energyNeeded + " joules ");
}
}