package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class PointsInaTriangle3_27 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" enter the coordinates of a point: ");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
	double x1 =0, y1= 0, x2= 200, y2 = 0, x3 = 0, y3 = 100;
	
	double d = (x2-x1)*(y3-y1) - (x3-x1)* (y2 - y1); 
	double wA =((x4 - x1) * ((y2 - y1)-(y3 - y1)) + (y4- y1) * ((x3-x1)- (x2 - x1)) + (x2-x1)* (y3-y1) - (x3-x1)*(y2-y1)) / d ;
	double wB =((x4-x1)*(y3-y1) - (y4-y1)*(x3-x1)) / d;
	double wC =((y4 - y1) * (x2-x1) - (x4-x1)*(y2-y1)) / d;
	
		if (wA >0 && wA < 1) {
			if(wB >0 && wB < 1) {
				if (wC >0 && wC < 1) {
					System.out.println(" the point is inside of the triangle ");
				}
			}
		}
	
	else 
		System.out.println(" the point is not in the triangle ");
	}

}
