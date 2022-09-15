package chapters.chapter_03_Exercises;
import java.util.Scanner;
public class AdditionQuiz3_10 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);

		Scanner input = new Scanner(System.in);
		System.out.print("What is " +a + " + " +b + " ? ");
		int answer = input.nextInt();
		
		System.out.println(a + " + " +b + " = " + answer + " is " + ( a+b == answer));

	}

}
