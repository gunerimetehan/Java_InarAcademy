package chapters.chapter_05_Exercises;

public class Exercise5_18 {
	public static void main(String[] args) {
		patternA();
		patternB();
		patternC();
		patternD();
	}

	public static void patternA() {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}

	}

	public static void patternB() {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= (7 - i); j++) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	}

	public static void patternC() {

		System.out.println();
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.printf("%2s", ""); // System.out.print(" "); also works but its better with spaces;
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	}

	public static void patternD() {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j > 1; j--) {
				System.out.printf("%2s", "");
			}
			for (int j = 1; j <= (7 - i); j++) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	}
}