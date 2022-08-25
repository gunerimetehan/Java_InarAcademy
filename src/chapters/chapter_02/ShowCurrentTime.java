package chapter_02;

public class ShowCurrentTime {
public static void main(String[] args) {
	// System.currentTimeMillis();
	//obtain the total milliseconds since midnight, Jan 1, 1970
	
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
	
	System.out.println("Current time is " + currentHour + " : " +currentMinute + " : " + currentSecond + " GMT " );
	

	
	
	//How to display time diff between timezones ????
	
	System.out.println("Current time is " +(currentHour + 03)+  " : " +currentMinute + " : " + currentSecond + " TSİ " );
	

}
}
