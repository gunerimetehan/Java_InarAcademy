package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_4AreaOfAHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the side: ");
		double s = input.nextDouble();
		input.close();
		double area = 6 * Math.pow(s, 2) / (4* Math.tan(Math.PI / 6));
		
		System.out.println(Math.round(area*100)/100.0);
	}
}
