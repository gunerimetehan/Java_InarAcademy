package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class AdditionQuiz3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)( Math.random()*100);
		int number2 = (int)(Math.random()*100);
		int number3 = (int)(Math.random()*100);
		
		System.out.print(" What is " +number1 + " + " +number2 + " + " + number3 + " ?:");
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " =" +answer +" is " + (number1 + number2 + number3 ==answer));		
		
		
		
	}
			

}
