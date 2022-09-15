package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class FutureDays3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter an integer for today's day: ");
		int todaysDay = input.nextInt();
		System.out.print(" Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		input.close();
		
		switch(todaysDay % 7) {
		case 0: System.out.println("Today is Sunday" ); break;
		case 1: System.out.println("Today is Monday"); break;
		case 2: System.out.println("Today is Tuesday"); break;
		case 3: System.out.println("Today is Wednesday"); break;
		case 4: System.out.println("Today is Thursday "); break;
		case 5: System.out.println("Today is Friday"); break;
		case 6: System.out.println("Today is Saturday"); break;

		}
		switch((todaysDay + elapsedDays) % 7){
		case 0: System.out.println(" future day is Sunday " ); break;
		case 1: System.out.println("future day is Monday"); break;
		case 2: System.out.println("future day is Tuesday"); break;
		case 3: System.out.println("future day is Wednesday"); break;
		case 4: System.out.println("future day is Thursday "); break;
		case 5: System.out.println("future day is Friday"); break;
		case 6: System.out.println("future day is Saturday"); break;
		}
	}
}
