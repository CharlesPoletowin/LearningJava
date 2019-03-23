package fourthWeek;

public class ComputerPower {
	public static void compPower(double x,double y) {
		System.out.println("Now in public static void compPower(double a,double b)");
		System.out.println("x="+x+" y="+y);
		x=x*x;
		y=y*y;
		System.out.println("x^2="+x+"  y^2="+y);
		System.out.println("end function public static void compPower");
	}
	public static void compPower(Parameter p) {
		double a = p.getA();
        double b = p.getB();
        a = a * a;
        b=b*b;
        System.out.println("Now in public static void compPower(Parameter p)" );
        p.setA(a);
        p.setB(b);
        System.out.println("a=" + a + " b=" + b);
        System.out.println("end function public static void compPower");
	}
}
