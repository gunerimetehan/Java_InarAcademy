package chapters.chapter_05_Exercises;

public class Exercise5_26 {
	public static void main(String[] args) {
		double e = 1;
		double n = 1;

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= 10000 * i; j++) {
				n *= j;
				e = e + 1 / n;
			}
			n = 1;
			System.out.println("I = " + (i * 10000) + " e is " + e);
			e = 1;

		}
	}

}
