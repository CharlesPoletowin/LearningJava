package fourthWeek;

class secondHomework{
	static double x;
	int y;
	static void inx(double a) {
		x=a;
	}
	void iny(int b){
		this.y=b;
	}
	static double getx() {
		return x;
	}
	int gety() {
		return this.y;
	}
}

public class Second {
	public static void main(String args[]) 
	{
		secondHomework sec1=new secondHomework();
		secondHomework sec2=new secondHomework();
		sec1.inx(3);
		sec1.iny(4);
		System.out.println("in sec1,x£º"+sec1.getx()+"  y:"+sec1.gety());
		System.out.println("now we set the values for another obejct");
		secondHomework.inx(7);
		sec2.iny(8);
		System.out.println("in sec1,x£º"+sec1.getx()+"  y:"+sec1.gety());
		System.out.println("in sec2,x£º"+sec2.getx()+"  y:"+sec2.gety());
	}

}
