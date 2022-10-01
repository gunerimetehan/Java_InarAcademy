package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number =1;
		int max = 0;
		int count = 1;
		System.out.print(" Enter integers(it ends when 0 occured):\n");
		while (number != 0) {

			 number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
				continue;
			} else if (number == max) {
				count++;
				continue;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence of the largest number is " + count);
	}

}
