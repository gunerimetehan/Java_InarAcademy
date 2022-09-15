package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_13VowelOrConsonant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter a letter: ");
		String letter = in.next();
		
		if (letter.length() > 1) {
			System.out.println(" You must enter exactly one charecter ");
			System.exit(1);
		}
		char ch = letter.charAt(0);
		if(ch >= 97 && ch <= 122 ) {
			System.out.println(ch + " is wowel");
		}
		else if (ch >= 65 && ch <= 90) {
			System.out.println(ch + " is consonant ");
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
	}
	}
