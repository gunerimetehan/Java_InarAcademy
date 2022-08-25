package chapter_02;
import java.util.Scanner;


public class Sections2_23CostOfDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the driving distance in miles: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon; ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print(" enter the price of gallon: ");
		double priceOfGallon = input.nextDouble();
		
		double costOfDriving =(int)(100* distance/milesPerGallon*priceOfGallon) /100.0;
		
		System.out.println(" the cost of driving is $ " + costOfDriving );
		
	}
}
