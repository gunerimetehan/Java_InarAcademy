package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_2_GreatCircleDistance {
	public static void main(String[] argd) {
		Scanner mete = new Scanner(System.in);
		System.out.print(" Enter point 1 ( latitude and longitude) in degrees: ");
		double latitude1 = mete.nextDouble();
		latitude1 =Math.toRadians(latitude1);
		double longitude1 = mete.nextDouble();
		longitude1 = Math.toRadians(longitude1);
		System.out.print(" Enter point 1 ( latitude and longitude) in degrees: ");
		double latitude2 = mete.nextDouble();
		latitude2 = Math.toRadians(latitude2);
		double longitude2 = mete.nextDouble();
		longitude2 = Math.toRadians(longitude2);
		final double earthRadius = 6371.01;
		
		//double d = earthRadius *  Math.acos(Math.sin(Math.toRadians(latitude1))) * Math.sin(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude1))* Math.cos(Math.toRadians(latitude2))* Math.cos(Math.toRadians(longitude1) - Math.toRadians(longitude2));
		double d = earthRadius *  Math.acos(Math.sin(latitude1)) * Math.sin(latitude2) * Math.cos(latitude1)* Math.cos(latitude2)* Math.cos((longitude1 - longitude2));

		System.out.println(" distance between two points is " + d + " km " ); 
	}
}
