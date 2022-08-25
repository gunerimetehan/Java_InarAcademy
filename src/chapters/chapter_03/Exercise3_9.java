package chapters.chapter_03;
import java.util.Scanner;

public class Exercise3_9 {
public static void main(String[] argd) {
	Scanner input = new Scanner(System.in);
	

	System.out.print(" enter 2 integers: ");
	int x = input.nextInt();
	int y = input.nextInt();
	
	
	if (x>2)
		if (y>2) {
			int z = x +y;
			System.out.println(" z is " +z);
		}
		else
			System.out.println(" x is " + x);
}
}
