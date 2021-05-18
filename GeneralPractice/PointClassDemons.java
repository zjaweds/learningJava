import java.lang.Math;

public class Point{
    private int x,y;

    public static Point ORIGIN = new Point(0,0);
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static double distanceBetween(Point P1,Point P2){
        double dx=P2.x-P1.x;
        double dx=P2.y-P1.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distanceTo(Point that){
        double dx=that.x-this.x;
        double dx=that.y-this.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public boolean equals(Object object){
        if(object==this)
            return true;
        if(!(object instanceof Point))
            return false;
        Point that = (Point) object;
        return(this.x==that.x && this.y==that.y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
class TestPoint{
    public static void main(String a[]){
        Point p =new Point(2,-3);
        System.out.println("p: "+p);
        Point q= new Point(7,9);
        System.out.println(Point.distanceBetween(p,q));
    }
}