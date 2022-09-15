package chapters.chapter_04;

public class trials {
	public static void main(String[] args) {
		double x = Math.ceil(2.1);
		System.out.println(x);
		x = Math.floor(2.99);
		System.out.println(x);
		x=Math.rint(2.5);
		System.out.println(x);
		x= Math.rint(3.5);
		System.out.println(x);
		x = Math.round(2.5f);
		System.out.println(x); // returns integer
		x = Math.round(2.4);
		System.out.println(x);//returns long
		
		double y = Math.round(Math.sin(2* Math.PI))  ;
		System.out.println(y);
		y = Math.cos(2*Math.PI);
		System.out.println(y);
		y=Math.exp(Math.E);
		System.out.println(y);
		y = Math.max(2, Math.min(3, 4));
		System.out.println(y);

		double z = Math.toRadians(47);
		System.out.println(z);
		z= Math.toDegrees(Math.PI / 7);
		System.out.println(z);






	}
}
