import java.util.*;
import java.lang.*;

class Point{
    private double x,y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void display(){
        System.out.println("("+ x +","+ y + ")");
    }
    public static double distance(Point P1, Point P2){
        double dx = P1.x - P2.x;
        double dy = P1.y - P2.y;
        System.out.println("Class method Called");
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distanceBetween(Point P1){
        double dx = P1.x - this.x;
        double dy = P1.y - this.y;
        System.out.println("Instance method Called");
        return Math.sqrt(dx*dx + dy*dy);
    }
}

class TestingPoint{
    public static void main(String a[]){
        Point P = new Point(2,3);
        Point Q = new Point(5,6);
        P.display();
        Q.display();
        P.distanceBetween(Q);
        System.out.println("Distance between the Points P and Q is: " + Point.distance(P,Q));
    }
}