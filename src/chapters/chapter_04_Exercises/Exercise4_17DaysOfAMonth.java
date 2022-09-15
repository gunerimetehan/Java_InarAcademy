package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_17DaysOfAMonth {
	public static void main(String[] args) {
		Scanner mete = new Scanner(System.in);
		
		System.out.print(" Enter first three letters of a month with the first letter uppercase:\n ");
		String mounth = mete.nextLine();
		System.out.print (" enter a year: \n");
		int year = mete.nextInt();
		
		String set1 = "Jan, Mar, May,Jul,Aug,Oct,Dec";
		String set2 = "Apr,Jun, Sep,Nov";
		String set3 = "Feb";
		
		if(set1.contains(mounth)) {
			System.out.println(mounth + " " + year + " has 31 days ");
		}
		else if(set2.contains(mounth)) {
			System.out.println(mounth + " " + year + " has 30 days");
		}
		else if (set3.contains(mounth)) {
		if (( year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
			 System.out.println(mounth + " "  + year + " had 29 days" );
		}
		
		else if (!( year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
			 System.out.println(mounth + " "  + year + " had 28 days" );
		}
		}
		else {
			System.out.println(" Invaid input");
		}
	}
}
