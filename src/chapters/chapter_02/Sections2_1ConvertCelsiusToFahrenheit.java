package chapter_02;
import java.util.Scanner;

public class Sections2_1ConvertCelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in celcius: ");
		double degreeInCelsius = input.nextDouble();
		
		double degreeInFahrenheit = (9.0 / 5) * degreeInCelsius + 32;
	
		System.out.println(degreeInCelsius + "Celsius is equals to " + degreeInFahrenheit + "degrees in Fahrenheit ");
		
		
	}

}
