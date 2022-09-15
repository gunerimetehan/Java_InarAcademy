package chapters.chapter_03_Exercises;
import java.util.Scanner;
public class LinearQquations3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter a,b,c,d,e,f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		// x = (ed - bf) / (ad-bc)
		//y = (af - ec) / (ad - bc)
		if ((a*d)-(b*c) == 0){
			System.out.println(" The equation has no solutions ");	
		}
		else {
		double x = (e*d - b*f) / (a*d-b*c);
		double y =  (a*f - e*c) / (a*d - b*c);
		
		System.out.println(" x is " + x + " and y is" + y);
		
	}

	}
}
