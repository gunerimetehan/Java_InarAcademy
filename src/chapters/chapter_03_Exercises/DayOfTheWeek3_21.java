package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class DayOfTheWeek3_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" enter year, e.g 2012 ");
		int year = input.nextInt();
		
		System.out.print(" enter month, 1-12 ");
		int month = input.nextInt();
		input.close();
		
		if (month == 1) {
			month = 13;
			year -=1;
		}
		else if (month == 2) {
			month = 14;
			year -=1;
		}
		
		System.out.print(" enter the day of the month ");
		int dayOfTheMonth = input.nextInt();
		int yearOfTheCentury = year % 100;
		int century = year / 100;
		
//int dayOfTheWeek = (int) (dayOfTheMonth + 26*(month +1)/10.0 + yearOfTheCentury + yearOfTheCentury /4.0 + century / 4.0 + 5* century) ;
		int dayOfTheWeek =  (dayOfTheMonth + 26*(month +1)/10 + yearOfTheCentury + yearOfTheCentury /4 + century / 4+ 5* century) ;

		
		switch (dayOfTheWeek % 7) {
		case 0 : System.out.println( " Day of the week is Saturday " ); break;
		case 1 : System.out.println( " Day of the week is Sunday " ); break;
		case 2 : System.out.println( " Day of the week is Monday " ); break;
		case 3 : System.out.println( " Day of the week is Tuesday " ); break;
		case 4 : System.out.println( " Day of the week is Wednesday" ); break;
		case 5 : System.out.println( " Day of the week is Thursday " ); break;
		case 6 : System.out.println( " Day of the week is Fridayay " ); break;

		}
		
		
				
	
	}

}
