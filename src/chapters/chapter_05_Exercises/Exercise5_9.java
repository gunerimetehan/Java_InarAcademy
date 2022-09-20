package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the number of students");
		final int numberOfStudents = input.nextInt();
		
		double highestScore =0;
		double secondHighestScore =0;
		
		String studentWithHighestScore ="";
		String studentWithSecondHighestScore ="";
		
		for(int i =1;i<=numberOfStudents;i++) {
			System.out.print(" Enter the students name and score ");
			String name = input.next();
			double score = input.nextDouble();
			
			if(score > secondHighestScore) {
				secondHighestScore = score;
				studentWithSecondHighestScore = name;
			}
			
			if(score > highestScore) {
				secondHighestScore = highestScore;
				studentWithSecondHighestScore = studentWithHighestScore;
				
				highestScore = score;
				studentWithHighestScore = name;
				}
			
			
		}
		System.out.println("Student gets the highest score is " + studentWithHighestScore +" with the score of " +highestScore);
		System.out.println("Student gets the second highest score " + studentWithSecondHighestScore +" with the score of " +secondHighestScore);
		input.close();
	}
}


