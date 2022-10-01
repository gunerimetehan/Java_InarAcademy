package chapters.chapter_05_Exercises;

public class Exercise5_23 {
	public static void main(String[] args) {
		double sumFromLeft =0;
		double sumFromRight =0;
		for(int i=1;i<=5000;i++) {
			sumFromLeft +=1.0/i;
		}
		for(int j=5000;j>=1;j--) {
			sumFromRight +=1.0/j;
		}
		System.out.println("Summation from right to left:" +sumFromRight);
		System.out.println("Summation from left to right:" +sumFromLeft);
	}

}
