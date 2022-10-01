package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year and first day of the year(0 for Sunday)");
		int year = input.nextInt();
		int day = input.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

		for (int i = 1; i < 13; i++) {
			day = day % 7;
			switch (i) {
			case 1:
				System.out.printf("%28s\n", "January" + year);
				break;
			case 2:
				System.out.printf("%28s\n", "February" + year);
				break;
			case 3:
				System.out.printf("%28s\n", "March" + year);
				break;
			case 4:
				System.out.printf("%28s\n", "April" + year);
				break;
			case 5:
				System.out.printf("%28s\n", "May" + year);
				break;
			case 6:
				System.out.printf("%28s\n", "June" + year);
				break;
			case 7:
				System.out.printf("%28s\n", "July" + year);
				break;
			case 8:
				System.out.printf("%28s\n", "August" + year);
				break;
			case 9:
				System.out.printf("%28s\n", "September" + year);
				break;
			case 10:
				System.out.printf("%28s\n", "October" + year);
				break;
			case 11:
				System.out.printf("%28s\n", "November" + year);
				break;
			case 12:
				System.out.printf("%28s\n", "December" + year);
				break;
			}
			System.out.println("_________________________________");
			System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Wed", "Thu", "Fri", "Sat" );

			// leave the spaces
			for (int j = 0; j < day; j++) {
				System.out.printf("%7s", " ");
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				for (int k = 1; k < 32; k++) {
					if (day % 7 == 6) {
						System.out.printf("%7d/n", k);
					} else {
						System.out.printf("%7d", k);
					}
					day++;
				}

			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				for (int k = 1; k < 30; k++) {
					if (day % 7 == 6) {
						System.out.printf("%7d/n", k);
					} else {
						System.out.printf("%7d", k);
					}
					day++;
				}
			} else {
				if (isLeapYear) {
					for (int k = 1; k < 29; k++) {
						if (day % 7 == 6) {
							System.out.printf("%7d/n", k);
						} else {
							System.out.printf("%7d", k);
						}
						day++;
					}
				} else {
					for (int k = 1; k < 28; k++) {
						if (day % 7 == 6) {
							System.out.printf("%7d/n", k);
						} else {
							System.out.printf("%7d", k);
						}
						day++;
					}
				}
			}
		}
		System.out.println();
	}
}