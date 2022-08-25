package chapter_02;
import java.util.Scanner;

public class Sections2_11PopulationProjection {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter number of years: ");
	int numberOfYears = input.nextInt();
	
	//One birth every 7 seconds
	// One death every 13 seconds
	// One new immigrant every 45 seconds
	//current population = 312_032_486
	
	int currentPopulation = 312032486;
	
	int populationInGıvenYears = (int) (currentPopulation + numberOfYears *60*24*365*( 60/7.0 + 60/45.0 - 60/13.0));
	
	System.out.print(" The populatin in " + numberOfYears + " years  is " + populationInGıvenYears);  
	}
	

}
