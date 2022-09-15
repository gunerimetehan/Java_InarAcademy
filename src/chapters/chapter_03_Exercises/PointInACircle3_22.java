package chapters.chapter_03_Exercises;
import java.util.Scanner;
public class PointInACircle3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" enter a point with two coordinates ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		final double r = 10;
		double x1 = 0;
		double y1 = 0;
		
		double distanceX = Math.pow(x2-x1, 2);
		double distanceY = Math.pow(y2-y1, 2);
		double distance = Math.pow(distanceX + distanceY, 0.5);
		
		if (distance <= r) {
			System.out.println(" Point ( " + x2 + ", " + y2 + " ) is in the circle ");
		}
		else
			System.out.println(" point ( " + x2 + " , " + y2 + " ) is not in the circle ");
	
	}

}
