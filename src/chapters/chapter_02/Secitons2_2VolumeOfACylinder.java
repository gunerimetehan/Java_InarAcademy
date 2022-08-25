package chapter_02;
import java.util.Scanner;

public class Secitons2_2VolumeOfACylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the length of the cylinder in double: ");
		double length = input.nextDouble();
		
		System.out.print("Enter the radius of the cylinder in double: ");
		double radius = input.nextDouble();
		
		final double PI =3.14159;
		double volume = PI * radius *radius * length;
		
		System.out.println(volume + " is the volume of given length and radius");
		
		
		
	}

}
