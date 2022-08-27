package chapters.chapter_03;

public class ConditionalOperatorOnlyTernaryInJava {
	public static void main(String[] args) {
		int ages = (int)(Math.random()*100);
		
		System.out.println(( ages >= 16) ? " ticket price = 20 " : " ticket price = 10 ");
		
		
		//3.34
		int scale = 10;
		int score = (int)(Math.random()*100);
		
		if ( score > 10) {
			score = 3 * scale;
		 	System.out.println(score);
		}
		
		else {
			score = 4 * scale;
		 	System.out.println(score);
		}
	}

}
