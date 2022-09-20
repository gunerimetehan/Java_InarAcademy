package chapters.chapter_05_Exercises;

public class Exercise5_5 {
	public static void main(String[] args) {
		final double poundsPerKilogram =2.2;
		System.out.println("Kilograms    Pounds   |     Pounds      Kilograms");
		for(int i =1,j=20;i<=200;i+=2,j+=5) {
			System.out.printf("%-8d %8.2f %5c %8d %14.2f\n", i, i*poundsPerKilogram,'|', j, j/poundsPerKilogram);
				
				}
		
		}
	}


