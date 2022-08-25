package chapters.chapter_03;
import java.util.Scanner;

public class Checkpoint3_5 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter a score: ");
	double score = input.nextDouble();
	
	double pay = 10;
	
	if (score > 90) {
		pay = pay + pay * 0.03;
		System.out.println(" pay = " + pay);
	}
	else {
		pay = pay + pay * 0.01;
		System.out.println( " pay = " + pay);
	}
		
}
	

}
