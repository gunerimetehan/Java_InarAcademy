package chapter_02;
import java.util.Scanner;

public class sections2_4PoundsIntoKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilogram = 0.454 * pounds;
		
		System.out.println( pounds + "pounds are equal to " + kilogram + " kilograms ");
	}
}
