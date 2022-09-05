package cartesianSystem;
import java.util.*;

public class Calculate_LengthOf_Line {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter X1 co-ordinate");
		int x1 = sc.nextInt();
		System.out.println("enter Y1 co-ordinate");
		int y1 = sc.nextInt();
		System.out.println("enter X2 co-ordinate");
		int x2 = sc.nextInt();
		System.out.println("enter Y2 co-ordinate");
		int y2 = sc.nextInt();
		double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of the line is: " + length);
	}
}
