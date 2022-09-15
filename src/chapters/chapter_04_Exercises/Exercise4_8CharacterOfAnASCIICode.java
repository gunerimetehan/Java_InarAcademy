package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_8CharacterOfAnASCIICode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an ASCII code: ");
		int code = input.nextInt();
		char ch = (char)code;
		
		System.out.println("The character for ASCII code " + code + " is " +  ch);
	}
}
