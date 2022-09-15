package chapters.chapter_04;

public class CharTrials {
	public static void main(String[] args) {
		// by assigning variable to an integer
		char numChar = '1';
		int ascii = numChar;
		System.out.println(ascii);
		
		//using type casting
		char letter = 'A';
		System.out.println((int) letter);
		
		char a = 'a';
		System.out.println((int) a);
		
		int i = '1';
		System.out.println(i);
		
		char c = 90;
		System.out.println( c);
		
	     i = 97;
	     c = (char) i;
		System.out.println(c);
		
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x-y);
		
		// Random Lower Case Generation
		int random = (int) ((Math.random()*(123-97))+97);
		char lowerCaseLetter = (char) random;
		System.out.println(lowerCaseLetter);
		
		




				
	
	}
	
	
}
