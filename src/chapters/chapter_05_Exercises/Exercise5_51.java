package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();

		boolean isCommon = false;

		int i = 0;
		while (s1.charAt(i) == s2.charAt(i)) {
			if (i == 0) {
				System.out.print("The largest common prefix is ");
			}
			System.out.print(s1.charAt(i));
			i++;
			isCommon = true;
		}
		if (!isCommon) {
			System.out.print(s1 + " and " + s2 + " have no common prefix");
			System.exit(1);
		}

	}
}