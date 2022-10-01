package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_28 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the year and first day of the year(0 for Sunday)");
		int year =input.nextInt();
		int day=input.nextInt();
		boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		
		for(int i=1;i<13;i++) {
			if(i==1) {
				day=day%7;
			}
			else if(i==3||i==5||i==7||i==8||i==10||i==12) {
				day=(day+31)%7;
			}
			else if(i==4||i==6||i==9||i==11) {
				day=(day+30)%7;
			}
			else {
				if(isLeapYear) {
					day=(day+29)%7;
				}
				else {
					day=(day+28)%7;
				}
			}
			switch(i) {
			case 1:System.out.print("January 1, " + year + " is ");break;
			case 2:System.out.print("February 1, " + year + " is ");break;
			case 3:System.out.print("March 1, " + year + " is ");break;
			case 4:System.out.print("April 1, " + year + " is ");break;
			case 5:System.out.print("May 1, " + year + " is ");break;
			case 6:System.out.print("June 1, " + year + " is ");break;
			case 7:System.out.print("July 1, " + year + " is ");break;
			case 8:System.out.print("August 1, " + year + " is ");break;
			case 9:System.out.print("September 1, " + year + " is ");break;
			case 10:System.out.print("October 1, " + year + " is ");break;
			case 11:System.out.print("November 1, " + year + " is ");break;
			case 12:System.out.print("December 1, " + year + " is ");break;
			
			}
			switch(day) {
			case 0:System.out.println("Sunday");break;
			case 1:System.out.println("Monday");break;
			case 2:System.out.println("Tuesday");break;
			case 3:System.out.println("Wednesday");break;
			case 4:System.out.println("Thursday");break;
			case 5:System.out.println("Friday");break;
			case 6:System.out.println("Saturday");break;
			}
		}
		System.out.println();
	}

}
