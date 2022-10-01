package chapters.chapter_05_Exercises;

public class Exercise5_27 {
	public static void main(String[] args) {
		int yearsPerLine = 10;
		int count = 0;
		boolean isLeapYear = true;
		for (int i = 101; i < 2100; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				isLeapYear = true;
				count++;

				if (isLeapYear && count % yearsPerLine != 0) {
					System.out.print(i + " ");
				} else if (isLeapYear && count % yearsPerLine == 0) {
					System.out.println(i);
				}

			}
		}
		System.out.println();
		System.out.println("Number of leap years is " + count);
	}
}