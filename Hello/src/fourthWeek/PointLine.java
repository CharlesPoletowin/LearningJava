package fourthWeek;
import java.util.Scanner;

public class PointLine {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please input x and y");
		int a=in.nextInt();
		int b=in.nextInt();
		Point p1=new Point(a, b);
		System.out.println("Please input another x and y");
		int c=in.nextInt();
		int d=in.nextInt();
		Point p2=new Point(c, d);
		Line L1=new Line(p1, p2);
		System.out.print("The line is y="+L1.slope+"x"+"+"+L1.intercept);
		System.out.println(" ");
		System.out.print("The length is:"+L1.length);
	}
}
