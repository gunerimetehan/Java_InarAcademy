package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class ISBN10_3_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.print(" Enter the first 9 digits of an ISBN as integer: ");
	int ISBNNumber = input.nextInt();
	
	int number9 = ISBNNumber % 10;
	int number8 = (ISBNNumber /10) %10;
	int number7 = (ISBNNumber /100) %10;
	int number6 = (ISBNNumber /1000) %10;
	int number5 = (ISBNNumber /10000) %10;
	int number4 = (ISBNNumber /100000) %10;
	int number3 = (ISBNNumber /1000000) %10;
	int number2 = (ISBNNumber /10000000) %10;
	int number1 = (ISBNNumber /100000000) %10;
	
	int checksum = (number1 + 2*number2 + 3*number3 + 4*number4 + 5*number5 + 6*number6 + 7*number7 + 8*number8 + 9*number9) %11;
	if (checksum == 10) {
		System.out.println(ISBNNumber +"X");
	}
	else {
		System.out.println(ISBNNumber +""+checksum);
	}
	}

}
