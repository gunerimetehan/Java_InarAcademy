package chapters.chapter_05_Exercises;

public class Exercise5_19 {
	public static void main(String[] args) {
		for(int i =1;i<=8;i++) {
			for(int j =i;j<8;j++) {
				System.out.printf("%4s","");
			}
			for(int j =0;j<i;j++) {
				System.out.printf("%4d", (int)(Math.pow(2, j)));
			}
			for(int j=i-2;j>=0;j--) {
				System.out.printf("%4d", (int)(Math.pow(2, j)));
			}System.out.println();
		}
	}

}
