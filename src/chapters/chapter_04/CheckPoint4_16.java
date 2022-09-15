package chapters.chapter_04;

public class CheckPoint4_16 {
	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
	
		System.out.println(s1 == s2);	
		System.out.println(s2 == s3);	
		System.out.println(s1.equals(s2));	
		System.out.println(s1.equals(s3));	
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s2));
		System.out.println(s1.charAt(0));	
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf("to"));	
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("o", 15));	
		System.out.println(s1.length());
		System.out.println(s1.substring(5));	
		System.out.println(s1.substring(5,11));
		System.out.println(s1.startsWith("Wel"));
		System.out.println(s1.endsWith("Java"));	
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));	
		System.out.println("\t Wel \t".trim());
		
		System.out.println("1" + 1);	
		System.out.println('1' + 1);	
		System.out.println("1" + 1 + 1);	
		System.out.println('1' + 1 + 1);
		
		System.out.println(1 + " Welcome " + 1 + 1);	
		System.out.println(1 + " Welcome " + (1 + 1));	
		System.out.println(1 + " Welcome " + ('\u0001' + 1 ));	
		System.out.println(1 + " Welcome " + 'a' + 1);	


		String s4 = " Welcome      ";
		String s5 = "welcome";
	/*	boolean isEqual = s4.equals(s5);
		System.out.println(isEqual);
*/

		boolean isEqual = s4.equalsIgnoreCase(s5);
		System.out.println(isEqual);

	/*	int x = s4.compareTo(s5);
		System.out.println(x);
*/
		int x = s4.compareToIgnoreCase(s5);
		System.out.println(x);
		
	/*	boolean b = s4.startsWith("AAA");
		System.out.println(b);
*/	
		boolean b = s4.endsWith("AAA");
		System.out.println(b);
		
		int y = s4.length();
		char z = s4.charAt(0);
		
		String s6 = s4 + s5;
		s6 = s4.concat(s5);
		
		System.out.println(s4.substring(1));
		System.out.println(s4.substring(1,4));
        s3 =s4.toLowerCase();
		System.out.println(s3);
		s3 = s4.trim();
		System.out.println(s3);
		System.out.println(s3.length());



		int e = s4.indexOf('e');
		System.out.println(e);
		int t = s4.lastIndexOf("abc");
		System.out.println(t);



		




	}

}
