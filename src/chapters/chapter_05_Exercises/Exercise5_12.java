package chapters.chapter_05_Exercises;

public class Exercise5_12 {
	public static void main(String[] args) {
		int n =1;
		
		while(Math.pow(n, 2)<12000) {
			n++;
		}
		System.out.println(n);
	}
}
