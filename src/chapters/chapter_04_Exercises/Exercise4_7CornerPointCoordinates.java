package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_7CornerPointCoordinates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the radius of the boundşng circle;  ");
		double radius = input.nextDouble();
		input.close();
		
		// total angle 360 
		
		double angle = Math.toRadians(360 / 5.0);
		double angle1 = angle;
		double angle2 = 2 * angle;
		double angle3 = 3 * angle;
		double angle4 = 4 * angle;
		double angle5 = 5 * angle;
		
		double y1 = radius * Math.cos(angle1);
		double x1 = radius * Math.sin(angle1);
		System.out.printf("(%-10.4f, %-10.4f\n", x1,y1);
		System.out.printf("(%-10.4f , %-10.4f)\n", radius * Math.sin(angle2), radius * Math.cos(angle2));
		System.out.printf("(%-10.4f, %-10.4f)\n", radius * Math.sin(angle3), radius * Math.cos(angle3));
		System.out.printf("(%-10.4f, %-10.4f)\n", radius * Math.sin(angle4), radius * Math.cos(angle4));
		System.out.printf("(%-10.4f, %-10.4f)\n", radius * Math.sin(angle5), radius * Math.cos(angle5));

	
	}

}
