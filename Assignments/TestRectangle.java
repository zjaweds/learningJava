import java.lang.*;
import java.util.*;

class Rectangle{
	class Point{
		double x,y;
		public Point(){
			this.x=0;
			this.y=0;
		}
	}
	Point p1,p2,p3,p4;
	Rectangle(){
		Point p1=new Point();
		Point p2=new Point();
		Point p3=new Point();
		Point p4=new Point();
		set(p1,p2,p3,p4);
	}
	void set(Point p1,Point p2,Point p3,Point p4){
		Scanner sc = new Scanner(System.in);
		p1.x= 0;
		p1.y=2;
		p2.x=4;
		p2.y=2;
		p3.x=4;
		p3.y=7;
		p4.x=0;
		p4.y=7;
		// System.out.println("Enter x for the first point: ");
		// p1.x = sc.nextDouble();
		// System.out.println("Enter y for the first point: ");
		// p1.y = sc.nextDouble();
		// System.out.println("Enter x for the second point: ");
		// p2.x = sc.nextDouble();
		// System.out.println("Enter y for the second point: ");
		// p2.y = sc.nextDouble();
		// System.out.println("Enter x for the third point: ");
		// p3.x = sc.nextDouble();
		// System.out.println("Enter y for the third point: ");
		// p3.y = sc.nextDouble();
		// System.out.println("Enter x for the fourth point: ");
		// p4.x = sc.nextDouble();
		// System.out.println("Enter y for the fourth point: ");
		// p4.y = sc.nextDouble();
		if((p1.x>=0 && p1.x<=50) && (p1.y>=0 && p1.y<=50) && (p2.x>=0 && p2.x<=50)&& (p2.y>=0 && p2.y<=50)&&(p3.x>=0 && p3.x<=50)&&(p3.y>=0 && p3.y<=50)&&(p4.x>=0 && p4.x<=50)&&(p4.y>=0 && p4.y<=50)){	
			System.out.println("\nCoordinates successfully assigned!!!");
		}
		else{
			System.out.println("\nCoordinates are either not in 1st quadrant or greater than 50!");
			System.exit(0);
		}
		if(this.areFormingRectangle(p1,p2,p3,p4))
			System.out.println("Forming a rectangle!");
		else
			System.out.println("Not forming a rectangle!");
	}
	double findDistance(Point p1,Point p2){
		return (Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)));
	}
	boolean areObeyingPythagorous(double p,double q,double r){
		if(p*p+q*q==r*r || p*p==q*q+r*r || q*q==p*p+r*r)
			return true;
		else
			return false;
	}
	boolean areFormingRectangle(Point A,Point B,Point C,Point D){
		Point points[];
		points = new Point[4];
		points[0].x=A.x;
		points[0].y=A.y;
		points[1].x=B.x;
		points[1].x=B.x;
		points[2].x=C.x;
		points[2].x=C.x;
		points[3].x=D.x;
		points[3].x=D.x;
		double d1,d2,d3;
		d1= findDistance(points[0],points[1]);
		d2= findDistance(points[0],points[2]);
		d3= findDistance(points[0],points[3]);
		for(Point p:points){
			for(Point q:points){
				if(findDistance(p,q)!=d1){
					if(findDistance(p,q)!=d2){
						if((findDistance(p,q)!=d3) && (p.x!=q.x && p.y!=q.y)){
							System.out.println("\nGiven coordinates can't form a rectangle!");
							return false;
						}
						else
							d3=findDistance(p,q);					
					}
					else
						d2=findDistance(p,q);
				}
				else
					d1=findDistance(p,q);
			}
		}
		if(areObeyingPythagorous(d1,d2,d3)){
			System.out.println("Yes they are following Pythagorous theorem!");
		}
		else
			return false;
		return true;
	}
}
class TestRectangle{
	public static void main(String args[]){
		// Point A=new Point(2,3);
		Rectangle rec =new Rectangle();
		System.out.println("Program executed!");
	}
}