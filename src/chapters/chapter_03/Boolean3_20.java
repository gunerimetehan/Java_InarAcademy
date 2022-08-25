package chapters.chapter_03;

public class Boolean3_20 {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 25);
		
		if (Math.abs(a - 5) < 4.5) {
			System.out.print(true);
		}
		else 
			System.out.print(false);
	}

}
