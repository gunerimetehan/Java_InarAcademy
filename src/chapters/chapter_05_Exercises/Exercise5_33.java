package chapters.chapter_05_Exercises;

public class Exercise5_33 {
	public static void main(String[] args) {

		for (int i = 1; i < 10000; i++) {
			int sum = 0;
			for (int j = i - 1; j > 0; j--) {
				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}
}
