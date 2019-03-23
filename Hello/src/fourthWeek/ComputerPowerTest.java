package fourthWeek;

public class ComputerPowerTest {
	public static void main(String args[]) {
		double a=4.0;
		double b=3.0;
		System.out.println("Now in ComputerPowerTest main function a="+a+", b="+b);
		ComputerPower.compPower(a, b);
		Parameter P=new Parameter(a,b);
		System.out.println("Main function a=" + P.getA() + " b:" + P.getB());
	}
}
