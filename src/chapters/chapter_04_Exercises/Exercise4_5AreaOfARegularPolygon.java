package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_5AreaOfARegularPolygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of sides:\n ");
		int n = input.nextInt(); 
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		double area = n * Math.pow(s, 2) / ( 4 * Math.tan(Math.PI / n));
		
		System.out.println(area);
	}
}
