package weeks.week_04;

public class palindrom {
	public static void main(String[] args) {
		String s = "hannah";
		boolean isPalindrome = true;
		
		int l = s.length();
		
		for (int i=0; i<l/2; i++) {
			if (s.charAt(i) != s.charAt(l-1-i)) {
				isPalindrome = false ;
			}
		if (isPalindrome) {
			System.out.println("Polindromdur");
		}
		else {
			System.out.println(" Polindrom değildir");
		}
		}
	}

}
