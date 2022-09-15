package chapters.chapter_03_Exercises;
import java.util.Scanner;
public class ScissorPaperRock3_17 {
	public static void main(String[] args) {
		
		int computerMove = (int)(Math.random()*3);
		//System.out.print(computerMove);
		
		Scanner input = new Scanner(System.in);
		System.out.print(" enter 0 for scissor, 1 for rock or 2 for paper: ");
		int userMove = input.nextInt();
		input.close();
		
		if (computerMove == 0 && userMove == 0){
			System.out.println(" Draw, please try again");
		}
		else if(computerMove ==0 && userMove == 1) {
			System.out.println(" Rock beats scissor, You won ");
		}
		else if(computerMove == 0 && userMove == 2) {
			System.out.println(" Scissor beats paper, You lost ");
		}
		else if(computerMove == 1 && userMove == 0) {
			System.out.println(" Rock beats scissor, You lost ");
		}
		else if(computerMove == 1 && userMove == 1) {
			System.out.println(" Draw, please try again ");
		}
		else if(computerMove == 1 && userMove ==2 ) {
			System.out.println(" Paper beats rock, You won ");
		}
		else if(computerMove == 2 && userMove ==0) {
			System.out.println(" Scissor beats paper, You won ");
		}

		else if(computerMove == 2 && userMove == 1) {
			System.out.println(" Paper beats rock, You lost ");
		}
		else if(computerMove == 2 && userMove == 2) {
			System.out.println("  Draw, please try again ");
		}


}
}