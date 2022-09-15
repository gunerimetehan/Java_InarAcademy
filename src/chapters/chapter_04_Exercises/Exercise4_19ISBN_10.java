package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_19ISBN_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.print(" Enter the first 9 digits of an ISBN as integer: ");
	String ISBNNumber = input.nextLine();
	
	if(ISBNNumber.length()>9) {
		System.out.println("You must enter exactly 9 characters ");
		System.exit(1);
	}
	
	int number = Integer.parseInt(ISBNNumber);
	int number9 = number % 10;
	int number8 = (number /10) %10;
	int number7 = (number /100) %10;
	int number6 = (number /1000) %10;
	int number5 = (number /10000) %10;
	int number4 = (number /100000) %10;
	int number3 = (number /1000000) %10;
	int number2 = (number /10000000) %10;
	int number1 = (number /100000000) %10;
	
	int checksum = (number1 + 2*number2 + 3*number3 + 4*number4 + 5*number5 + 6*number6 + 7*number7 + 8*number8 + 9*number9) %11;
	if (checksum == 10) {
		System.out.println(ISBNNumber +"X");
	}
	else {
		System.out.println(ISBNNumber +""+checksum);
	}
	
	
	}
}
