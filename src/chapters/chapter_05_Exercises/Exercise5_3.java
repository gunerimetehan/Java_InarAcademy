package chapters.chapter_05_Exercises;

public class Exercise5_3 {
	public static void main(String[] args) {
		final double j = 2.2;
		System.out.println("Kilograms     Pounds");
		for(int i =1; i<200;i+=2) {
			System.out.printf("%-10d %10.2f\n",i,i*j);
		}
	}

}
