package chapters.chapter_03_Exercises;
import java.util.Scanner;
public class PointsInARectangle3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		
		double width = 10;
		double height = 5;
		double x1=0;
		double y1=0;
		
		if (x2-x1 <= width/2 && y2-y1 <= height/2) {
			System.out.println(" Point ( " + x2 + ", " + y2 + " ) is in the rectangle ");
		}
		else
			System.out.println(" point ( " + x2 + " , " + y2 + " ) is not in the rectangle ");

	}
	

}
