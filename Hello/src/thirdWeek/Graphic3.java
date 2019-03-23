package thirdWeek;
import java.util.*;

public class Graphic3 {
	public static void main(String args[]) {
		double len1,len2,area;
	    Scanner in=new Scanner(System.in);
	    System.out.println("Please input the radius of the circle");
	    double f=in.nextDouble();
	    Circle circle=new Circle(f);
	    len1=circle.getLength();
	    System.out.println("the circumference of the circle is :"+len1); 
	    area=circle.getArea();
	    System.out.println("the area of the circle is :"+area); 
	    System.out.println("Please input the sides of the triangle!");
	    double a=in.nextDouble();
	    double b=in.nextDouble();
	    double c=in.nextDouble();
	    Triangle t1=new Triangle(a,b,c);
	    len2=t1.getCircumference();
        System.out.println("the Circumference of the triangle:"+len2); 
        area=t1.getArea(); 
        System.out.println("the area of the triangle:"+area); 
	    System.out.println("Please input the height of cone");
	    double h=in.nextDouble();
	    Cone cone=new Cone(circle,h);
	    area=cone.getArea();
	    System.out.println("the volume of the cone:"+area); 
	    System.out.println("to change the side of the triangle you may now input the sides of the triangle:"); 
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        t1.setABC(a,b,c) ;
        len2=t1.getCircumference();
        System.out.println("the Circumference of the triangle:"+len2); 
        area=t1.getArea(); 
        System.out.println("the area of the triangle:"+area); 
	}
}

class Triangle{
	double sideA,sideB,sideC;
	double area,circumference;
	boolean boo;
	public Triangle(){
		sideA=0;
		sideB=0;
		sideC=0;
		boo=false;
	}
	public Triangle(double a,double b,double c) {
		sideA=a;
		sideB=b;
		sideC=c;
		if((sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideC+sideB>sideA)) {
			boo=true;
		}
		else {
			boo=false;
		}
	}
	public double getCircumference() {
		return ingetCircumference();
	}
	private double ingetCircumference() {
		if(boo) {
			circumference=sideA+sideB+sideC;
			return circumference;
		}
		else {
			System.out.println("Not a Triangle! Error to get the length!");
			circumference=0;
			return 0;
		}
	}
	public double getArea() {
		if(boo)
        { 
          double p=(sideA+sideB+sideC)/2.0;
          area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
          return area;
        }
      else
        { 
          System.out.println("Not a Triangle! Error to get the Area!");
          area=0;
          return 0;
        }
	}
	public void setABC(double a,double b,double c) {
		sideA=a;
		sideB=b;
		sideC=c;
		if((sideA+sideB>sideC) && (sideA+sideC>sideB) && (sideC+sideB>sideA)) {
			boo=true;
		}
		else {
			boo=false;
		}
	}
}

class Circle{
	double radius,area;
	public Circle(){
		radius=0;
		area=0;
	}
	public Circle(double r){
		radius=r;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getLength() 
    {  
        return Math.PI*2*radius;
    }
	public void setRadius(double newRadius)
    {  
	       radius=newRadius;
	}
	public double getRadius() 
    { 
        return radius;
    }
}

class Cone{
	double height;
	Circle A;
	public Cone(Circle a,double b) {
		A=a;
		height=b;
	}
	public Cone() {
		Circle A;
		height=0;
	}
	public double getArea() {
		return A.getArea()*height/2;
	}
}