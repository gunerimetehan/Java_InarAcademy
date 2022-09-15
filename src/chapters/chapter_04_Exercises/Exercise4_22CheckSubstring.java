package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_22CheckSubstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter two strings: ");
		String s1 = input.next();
		String s2 = input.next();
		
		if(s1.contains(s2)) {
		System.out.println(s2 + " is a substring of " + s1);
		}
		else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
	}
}
