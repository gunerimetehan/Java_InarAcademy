package chapters.chapter_05_Exercises;

public class Exercise5_20 {
	public static void main(String[] args) {

		final int numberOfPrimesPerLine = 8;
		int count = 0;

		System.out.println(" The prime numbers between 2-1000 are\n");
		for (int number = 2; number <= 1000; number++) {

			boolean isPrime = true;

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;

				if (count % numberOfPrimesPerLine == 0) {
					System.out.println("  " + number);
				} else {
					System.out.printf("%5d", number);
				}

			}

		}
	}
}