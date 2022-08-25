package chapter_02;
import java.util.Scanner;

public class Section2_7NumberOfYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print( " Enter the number of minutes: ");
		int numberOfMinutes = input.nextInt();
	
		
		//min 7 60 --> hour /24 --> day/365 -->years"
		int years = numberOfMinutes / (60 * 24 * 365 );
		int remainingMinutes = numberOfMinutes % (60 * 24 * 365);
		int days = remainingMinutes / (60 * 24);
		
		System.out.println( numberOfMinutes + "minutes is approximately " + years + " years and " + days + " days " );
		
	}

}
