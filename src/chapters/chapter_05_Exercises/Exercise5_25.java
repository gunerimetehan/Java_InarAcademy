package chapters.chapter_05_Exercises;

public class Exercise5_25 {
	public static void main(String[] args) {
		final int n = 100000;

		double summations = 0;
		double subtractions = 0;

		for (int i = 1; i <= n; i += 4) {
			summations += 4 * (1.0 / i);
		}
		for (int j = 3; j <= n; j += 4) {
			subtractions += 4 * (-1.0 / j);
		}
		double PI = summations + subtractions;
		System.out.println(PI);
	}
}