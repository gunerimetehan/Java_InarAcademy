package chapters.chapter_05;
public class Listing5_7_MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("         Multiplication Table " );
			System.out.print(" ");
		for (int j =1;j<=9;j++) {
			System.out.print("   "+ j );
		}
		System.out.println("\n_________________________________");
		for(int i =1; i<=9; i++) {
			System.out.println(i + " |");
			for(int j =1;j<=9;j++) {
				System.out.printf("%4d", i * j );
			}
			System.out.println();
		}
	}
}
