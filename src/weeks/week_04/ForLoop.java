package weeks.week_04;

public class ForLoop {
	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			System.out.println(i);
			}
		forLoop();
		wowels("Metehan");
		unsuzHarfler("Metehan");
	}
	
	
	public static void forLoop() {
		String s = "MetehanInarAcademy";
		System.out.println(s);
		int length = s.length();
		
	for (int i=0; i<length; i= i+2) {
	System.out.print(s.charAt(i));	
	
	}
	}

public static void wowels(String s) {
	int l = s.toLowerCase().length();
	
	for(int i=0; i<l; i++) {
		char harf = s.charAt(i);
		
		if(harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
			System.out.print(harf);
			
		}
	}
}

public static void unsuzHarfler(String s) {
	int l = s.toLowerCase().length();
	
	for(int i=0; i<l; i++) {
		char harf = s.charAt(i);
		String b = "";

		if(!(harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u')) {
     System.out.print(b + s.charAt(i));
		
	}
}
}
}