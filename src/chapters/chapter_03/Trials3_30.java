package chapters.chapter_03;

public class Trials3_30 {
	public static void main(String[] args) {
		
		int x = 3, y = 3;
		switch (x+3) {
		case 6: y =1;break;
		default:  y+=1;
		
		}
		System.out.println("y = " + y)  ;
		
		int a =3, b = 3;
		if ( x + 3 == 6) {
			b =1;
		}
		else
			b +=1;
		System.out.println(" b = " + b);
		//3.31
		
		int c = 1, d = 4;
		switch (d) {
		case 1: c+=5; System.out.println(" c = " + c); break;
		case 2: c+=10; System.out.println(" c = " + c); break;
		case 3: c+=16; System.out.println(" c = " + c); break;
		case 4: c +=34; System.out.println(" c = " + c); break;
		
		}
		//3.32
		int days = (int)(Math.random() * (7)) ;
		
		switch (days) {
		case 0: System.out.println(" Sunday "); break;
		case 1: System.out.println(" Monday "); break;
		case 2: System.out.println(" Tueasday "); break;
		case 3: System.out.println(" Wednesday "); break;
		case 4: System.out.println(" Thursday "); break;
		case 5: System.out.println(" Friday"); break;
		case 6: System.out.println(" Saturday ");break;
		
		}
		 
		
	}

}
