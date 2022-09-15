package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_14LetterGradeToNumeric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a letter grade(A-F): ");
		String letterGrade = input.nextLine();
		int gradeNumber = 0;
		if(letterGrade.length() != 1) {
			System.out.print(" You must exactly enter one character ");
		System.exit(1);
		}
		if (letterGrade.equals("A")) {
			gradeNumber =4;
		}
		else if (letterGrade.equals("B")) {
			gradeNumber = 3;
		}
		else if (letterGrade.equals("C")) {
			gradeNumber = 2;
		}
		else if (letterGrade.equals("D")) {
			gradeNumber = 1;
		}
		else if (letterGrade.equals("F")) {
			gradeNumber = 0;
		}
		else {
			System.out.println(" Invalid input");
		}
		System.out.println(gradeNumber);
	}
}
