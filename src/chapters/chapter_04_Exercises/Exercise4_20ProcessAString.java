package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_20ProcessAString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a string: ");
		String userInput = input.nextLine();
		
		int length = userInput.length();
		char ch = userInput.charAt(0);
		
		System.out.println(" Length of the string iş " + length + " and first character of the string is " + ch);
	}

}
