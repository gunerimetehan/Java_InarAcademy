package chapter_02;
import java.util.Scanner;
import java.util.TimeZone;

public class Sections2_8CurrentTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since midnight, Jan 1, 1970
			long totalSeconds = totalMilliseconds / 1000;
			
			// Obtain the current second in the minute in the hour
			long currentSecond = totalSeconds % 60;
			
			// Obtain the total minutes
			long totalMinutes = totalSeconds / 60;
			
			// Obtain the current minute in the hour
			long currentMinute = totalMinutes % 60;
			
			// Obtain the total hours
			long totalHours = totalMinutes / 60;
			
			// Obtain the current hour;
			long currentHour = totalHours % 24;
			
			//Display the results
			//How to display time diff between timezones ????
			
			System.out.println("Current time is " +(currentHour + 03)+  " : " +currentMinute + " : " + currentSecond + " TSİ " );
			
		
	}
    
}
