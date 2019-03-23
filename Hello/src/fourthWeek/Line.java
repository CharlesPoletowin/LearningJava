package fourthWeek;

public class Line {
	public Point point;
    public double slope;
    public double intercept;
    public double length;
 
    public boolean isParallel(Line line) {
        return false;
    }
    public Line(Point p1,Point p2){
        if (p2.getX()==p1.getX()) {
        		this.intercept=1;
        		this.slope=1;
        		this.length=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
        }
        else {
        		this.intercept=(p1.getY()*p2.getX()-p1.getX()*p2.getY())/(p1.getX()-p2.getX());
        		this.slope=(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        		this.length=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
        }
    }
}
