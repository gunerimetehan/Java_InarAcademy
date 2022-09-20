package chapters.chapter_05_Exercises;
import java.util.Scanner;	
public class Exercise5_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of students");
		final int numberOfStudents = input.nextInt();
		double highestScore =0;
		String studentWithHighestScore ="";
		for(int i =1;i<=numberOfStudents;i++) {
			System.out.print(" Enter the students name and score ");
			String name = input.next();
			double score = input.nextDouble();
			
				if(score > highestScore) {
					highestScore = score;
					studentWithHighestScore = name;
				}
		}
		System.out.println(studentWithHighestScore +" with the score of " +highestScore);
		input.close();
	}
}
// En yğksek skoru 1 den fazla kişi alırsa nasıl davranılmalı ?