package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a decimal integer:");
		int decimal = input.nextInt();
		String binary = "";
		while (decimal != 0) {
			binary = decimal % 2+binary;
			decimal /= 2;

		}
		System.out.println(binary);
	}

}
