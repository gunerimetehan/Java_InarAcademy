package chapter_02;
import java.util.Scanner;

public class Sections2_6SumTheDigitsInAnInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Enter a number in integer betwween 0 and 1000: ");
		int number = input.nextInt();
		
		int unitsDigit = number % 10;
		int tensDigit = ( number / 10) % 10;
		int hunderedsDigit = number / 100;
		
		int summationOfDigits = unitsDigit + tensDigit + hunderedsDigit;
		
		System.out.println(" the summation of digits of given number is " + summationOfDigits );
	}

}
