package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_1_AreaOfAPentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the length from the center to a vertex: ");
		double r = input.nextDouble();
	
		double side = 2*r* Math.sin(Math.PI /5);
		
		double area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
		
		System.out.println(area);
		System.out.println(Math.ceil(area*100)/100 );

	}
}
