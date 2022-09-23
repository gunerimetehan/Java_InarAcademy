package chapters.chapter_05_Exercises;

public class Exercise5_15 {
	public static void main(String[] args) {
		int numberPerLine = 10;
		int count = 0;

		for (int i = 33; i < 127; i++) {
			count++;
			if (count % numberPerLine == 0) {
				System.out.println((char) (i));
			} else {
				System.out.print((char) (i) + " ");
			}
		}
	}
}