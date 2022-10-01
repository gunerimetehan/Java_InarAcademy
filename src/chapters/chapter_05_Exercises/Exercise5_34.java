package chapters.chapter_05_Exercises;

import java.util.Scanner;

public class Exercise5_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int userCount = 0;
		int computerCount = 0;

		while (Math.abs(computerCount - userCount) < 3) {
			System.out.print(" enter 0 for scissor, 1 for rock or 2 for paper: ");
			int userMove = input.nextInt();
			int computerMove = (int) (Math.random() * 3);

			if (computerMove == 0 && userMove == 0) {
				System.out.println(" Draw, please try again");
				continue;
			} else if (computerMove == 0 && userMove == 1) {
				System.out.println(" Rock beats scissor, You won ");
				userCount++;
			} else if (computerMove == 0 && userMove == 2) {
				System.out.println(" Scissor beats paper, You lost ");
				computerCount++;
			} else if (computerMove == 1 && userMove == 0) {
				System.out.println(" Rock beats scissor, You lost ");
				computerCount++;
			} else if (computerMove == 1 && userMove == 1) {
				System.out.println(" Draw, please try again ");
				continue;
			} else if (computerMove == 1 && userMove == 2) {
				System.out.println(" Paper beats rock, You won ");
				userCount++;
			} else if (computerMove == 2 && userMove == 0) {
				System.out.println(" Scissor beats paper, You won ");
				userCount++;
			}

			else if (computerMove == 2 && userMove == 1) {
				System.out.println(" Paper beats rock, You lost ");
				computerCount++;
			} else if (computerMove == 2 && userMove == 2) {
				System.out.println("  Draw, please try again ");
				continue;
			}

		}
		System.out.println("Computer score is " + computerCount + " and user score is " + userCount);
		if (computerCount > userCount) {
			System.out.println(" You lost:(");
		} else {
			System.out.println("You  won:)");
		}
	}

}
