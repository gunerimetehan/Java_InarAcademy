package chapters.chapter_05_Exercises;

public class Exercise5_4 {
	public static void main(String[] args) {
		final double kilometersPerMile =1.609;
		
		System.out.println("Miles            Kilometers");
		
		for(int i =1; i<=10;i++) {
			System.out.printf("%-12d %12.3f\n",i, i*kilometersPerMile );
		}
	}

}
