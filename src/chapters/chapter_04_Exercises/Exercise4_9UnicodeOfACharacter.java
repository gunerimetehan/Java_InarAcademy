package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_9UnicodeOfACharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter a character: ");
		String ch = in.nextLine();
		char character = ch.charAt(0);
		int uniCode = (int)character;
		System.out.println(uniCode);
		}

}
