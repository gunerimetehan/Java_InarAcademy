package chapters.chapter_03;


public class Returns0Or1Randomly {
	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 10) ;
		
		if (randomNumber >= 5) 
			System.out.println(0);
		else
			System.out.println(1);
		
	}
	

}
