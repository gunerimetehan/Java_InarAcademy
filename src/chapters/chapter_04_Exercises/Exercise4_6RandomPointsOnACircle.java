package chapters.chapter_04_Exercises;

public class Exercise4_6RandomPointsOnACircle {
	public static void main(String[] args) {
		double r = 40;
		//generate random numbers between 0 -- 360;
		double randomAngle = 0.5 + Math.random()*361;
		double angleInRadians = Math.toRadians(randomAngle);
		
		double x1 = r * Math.cos(angleInRadians);
		double y1 = r * Math.sin(angleInRadians);
		System.out.println(" x1, y1 :" + x1  +" , " + y1);
		
		double randomAngle2 = 0.5 + Math.random()*361;
		double angleInRadians2 = Math.toRadians(randomAngle2);
		double x2 = r * Math.cos(angleInRadians2);
		double y2 = r * Math.cos(angleInRadians2);
		System.out.println(" x2, y2 :" + x2  +" , " + y2);
		double randomAngle3 = 0.5 + Math.random()*361;
		double angleInRadians3 = Math.toRadians(randomAngle3);
		double x3 = r * Math.cos(angleInRadians3);
		double y3 = r * Math.sin(angleInRadians3);
		System.out.println(" x3, y3 :" + x3  +" , " + y3);
		//Compute the sides
		
		double a = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		double b = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		double c = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		
		//compute the angles
		
		double A = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2 * b * a)));
		
		System.out.println(Math.round(A* 100) /100.0  + " " + Math.round(B*100)/100.0 + " " + Math.round(C*100)/100.0 );

	}

}
