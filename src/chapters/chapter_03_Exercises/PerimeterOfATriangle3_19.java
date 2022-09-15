package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class PerimeterOfATriangle3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter three edges of a triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		input.close();
		
		if((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)) {
			
			double perimeter = edge1 + edge2 + edge3;
			System.out.println(" The perimeter of the triangle is " + perimeter);
		}
		else
			System.out.println(" The input is invalid ");
	
	}

}
