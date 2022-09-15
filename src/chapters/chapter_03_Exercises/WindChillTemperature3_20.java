package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class WindChillTemperature3_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the outside temperature in Fahrenheit between -58 F and 41 F: ");
		double temperature = input.nextDouble();
		if ( temperature >= 41 || temperature <= -58) {
			System.out.println(" You  entered invalid valu for temperature, please check ");
			return;
		}
		
		System.out.print(" Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		if (windSpeed <2) {
			System.out.println(" You  entered invalid value for wind spped, please check");
			return;
		}
		else {
		double windChillTemperature = 35.74 + 0.6215 * temperature -35.75*Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		System.out.println(windChillTemperature);
		}
}
}