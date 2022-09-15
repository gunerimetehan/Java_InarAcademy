package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class PalindromeNumber3_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter a three-digit number as integer: ");
		int number = input.nextInt();
		
		int unitsDigit = number % 10;
		int tensDigit = (number / 10) %10;
		int hundredsDigit = (number /100) % 10;
		
		if ( unitsDigit == hundredsDigit) {
			System.out.println(number + " is a palindrome ");
		}
		else 
			System.out.println(number + " is not a palindrome ");
	
}
}