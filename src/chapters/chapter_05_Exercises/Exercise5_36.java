package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the first 9 digits of an ISBN as integer: ");
		int ISBNNumber = input.nextInt();
		int sum = 0;
		int digits = ISBNNumber;
		for (int i = 9; i > 0; i--) {
			sum += i * (digits % 10);
			digits = digits / 10;
		}
		if (sum % 11 == 10) {
			System.out.println(ISBNNumber + "X");
		} else {
			System.out.println(ISBNNumber + "" + (sum%11));
		}
	}
}