package chapter_02;
import java.util.Scanner;

public class Sections2_16AreaOfAHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the side of a hexagon: ");
		double side = input.nextDouble();
		
		double areaOfHexagon =(int)( 3* Math.pow(3, 0.5) * Math.pow(side, 2) / 2 *10000) /10000.0;
	//	double areaOfHexagon = 3* Math.pow(3, 0.5) * side*side / 2 ;
		System.out.println(" Area of the hexagon is " + areaOfHexagon);
		
}
}