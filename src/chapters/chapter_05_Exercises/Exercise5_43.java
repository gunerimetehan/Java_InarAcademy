package chapters.chapter_05_Exercises;

public class Exercise5_43 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = i + 1; j < 8; j++) {
				count++;
				System.out.printf("%2d %2d\n", i, j);
			}
		}
		System.out.println(count);

	}

}
