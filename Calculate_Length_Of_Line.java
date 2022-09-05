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
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of the line1 is: " + length1);

                System.out.println("enter second line co-ordinates");
                System.out.println("enter A1 co-ordinate");
		int a1 = sc.nextInt();
		System.out.println("enter B1 co-ordinate");
		int b1 = sc.nextInt();
		System.out.println("enter A2 co-ordinate");
		int a2 = sc.nextInt();
		System.out.println("enter B2 co-ordinate");
		int b2 = sc.nextInt();
		double length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
		System.out.println("length of line2 is: "+length2);
		String str1 = Double.toString(length1);
    	        String str2 = Double.toString(length2);
		int res= str1.compareTo(str2);
		if(res > 0)
			System.out.println("line1 is greater than line2");
		else if(res < 0)
			System.out.println("line2 is greater than line1");
		else
			System.out.println("both lines are equal");
	}
}
