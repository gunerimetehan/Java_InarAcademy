package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class HeadOrTail3_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*2);
		
	    System.out.print(" Make a guess, 0 for head and 1 for tail: " );
	    int guess = input.nextInt();
	    
		if (randomNumber == 0 &&  guess == 0) 
			System.out.println(" Congratulations, your guess is right ");
			
		else if (randomNumber == 1 &&  guess == 1) 
			System.out.println(" Congratulations, your guess is right ");
		else 
			System.out.println(" Sorry, best luck for your next try ");

	}

}
