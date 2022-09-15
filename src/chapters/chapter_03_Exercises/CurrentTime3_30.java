package chapters.chapter_03_Exercises;
import java.util.Scanner;


public class CurrentTime3_30 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print(" Enter the time zone offset to GMT: ");
			int offset = input.nextInt();
			input.close();
			
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
				long currentHour = (totalHours + offset) % 24;
				
				if (currentHour < 12) {
					System.out.println("Current time is " +(currentHour )+  " : " +currentMinute + " : " + currentSecond + " AM " );

				}
				
				else if (currentHour >= 12) {
					currentHour = currentHour % 12;
					System.out.println("Current time is " +(currentHour )+  " : " +currentMinute + " : " + currentSecond + " PM " );

				}
			
				
				
			
		}
	    
	}



