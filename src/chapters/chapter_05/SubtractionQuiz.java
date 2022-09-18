package chapters.chapter_05;
import java.util.Scanner;
public class SubtractionQuiz {
	public static void main(String[] args) {
	
	final int numberOfQuestions = 5;
	int count = 0;
	int correctAnswer = 0;
	long startTime = System.currentTimeMillis();
	String output = "";
	
	Scanner input = new Scanner(System.in);
	
	while (count < numberOfQuestions) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		
		System.out.print(" What is " + number1 + " - " + number2 + " ? ");
		int answer = input.nextInt();
		
		if(answer == (number1-number2)) {
			System.out.println(" Correct answer");
			correctAnswer++;
		}
		else {
			System.out.println(" Your answer is wrong \n" +number1 + " - "  + number2 + " should be " + (number1-number2));
		}
		count++;
		
		output += "\n" +number1 + " - " + number1 + " =" +answer + ((number1-number2 ==answer)?"correct" :"wrong");
	}
		long endTime = System.currentTimeMillis();
		long testTime = endTime-startTime;
		
		System.out.println(" Correct count is " + correctAnswer + "\n Test time is " + testTime /1000 + "seconds\n" + output);
	}
}
