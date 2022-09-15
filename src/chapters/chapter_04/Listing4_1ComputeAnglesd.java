package chapters.chapter_04;
import java.util.Scanner;

public class Listing4_1ComputeAnglesd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the coordinates of three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
		double b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		double c = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
		
		double A = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2*b*c)));
		double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2*a*c)));
		double C = Math.toDegrees(Math.acos((c*c - a*a - b*b) / (-2*a*b)));
		
		System.out.println( Math.round(A *100) /100.0 + "  " + Math.round(B*100) / 100.0 +  "   " + Math.round(C*100) / 100.0);

	}

}
