package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_32 {
	public static void main(String[] args) {
	int lotteryDigit1 = (int)(Math.random()*10);
	int lotteryDigit2=lotteryDigit1;
	while(lotteryDigit2==lotteryDigit1) {
		lotteryDigit2 = (int)(Math.random()*10);
	}
	int lottery = lotteryDigit1*10 +lotteryDigit2;
	Scanner input = new Scanner(System.in);
	System.out.print(" Enter your lottery pick (Two Digits): ");
	int guess = input.nextInt();
	int guessDigit1 = guess / 10;
	int guessDigit2 = guess % 10;
	
	System.out.println(" The lottery number is " + lottery);
	
	if ( lottery == guess) {
		System.out.println(" Exact match: You win 10000 $");
	}
	else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
		System.out.println(" All digits matched : You win 3000 $ ");
	}
	else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 ||  lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 ) {
	    System.out.println(" MAtch one digit : You won 1000 $");
	}    
	else 
		System.out.println(" Sorry, no match");

}
}