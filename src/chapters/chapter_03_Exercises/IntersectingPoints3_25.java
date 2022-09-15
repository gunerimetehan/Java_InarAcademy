package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class IntersectingPoints3_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter x1, y1, x2, y2, x3, y3, x4, y4 :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2= input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double x,y;
		double slope1= (y2- y1) / (x2 - x1);
		double slope2 = (y4 - y3) / (x4 - x3);
		
		if (slope1== slope2) {
			System.out.println(" Two lines are parallel ");
		}
		else {
		//(y1-y2)*x - (x1-x2)*y = (y1-y2)*x1 - (x1-x2)*y1;
		//(y3-y4)*x - (x3-x4)*y = (y3-y4)*x3 - (x3 - x4)*y3;
		
		x = (((y1-y2)*x1 - (x1-x2)*y1) * (x3-x4) - (x1-x2) * ((y3-y4)*x3 - (x3 - x4)*y3)) / ((y1-y2) * (x3 - x4) - (x1-x2) * (y3 - y4));
		
		y = ((y1-y2) * ((y3-y4)*x3 - (x3 - x4)*y3) - ((y1-y2)*x1 - (x1-x2)*y1) * (y3-y4)) / ((y1-y2) * (x3 - x4) - (x1-x2) * (y3 - y4));	
				
				System.out.println(x +","+y);
				
		}
	}

}
