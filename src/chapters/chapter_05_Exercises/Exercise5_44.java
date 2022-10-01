package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_44 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a short integer
		System.out.print("Enter an integer: ");
		short number = input.nextShort();
		
		//it just worked with the positives
/*		String binary = "";
		while (number > 0) {
			binary = number % 2 + binary;
			number /= 2;
		}int count=0;
		for (int i = 1; i <= 16 - binary.length(); i++) {
			System.out.print(0);
			count++;
		}
		System.out.println(binary);
		System.out.println(count); */
		
		 StringBuilder bits = new StringBuilder();	// Holds the bits

	        // Get the 16 bits for the integer
	        for (int i = 0; i < 16; i++) {
	            bits.insert(0, (number & 1));
	            number >>= 1;
	        }

	        // Display result
	        System.out.println("The bits are " + bits);
	}

}
