import java.lang.*;
import java.util.*;
class Rectangle{
	Point p1,p2,p3,p4;
	static class Point{
		double x,y;
		public Point(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	Rectangle(Point p1,Point p2,Point p3,Point p4){
		set(p1,p2,p3,p4);
	}
	void set(Point p1,Point p2,Point p3,Point p4){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		p1.x = sc.nextDouble();
		System.out.println("Enter y: ");
		p1.y = sc.nextDouble();
		System.out.println("Enter x: ");
		p2.x = sc.nextDouble();
		System.out.println("Enter y: ");
		p2.y = sc.nextDouble();
		System.out.println("Enter x: ");
		p3.x = sc.nextDouble();
		System.out.println("Enter y: ");
		p3.y = sc.nextDouble();
		System.out.println("Enter x: ");
		p4.x = sc.nextDouble();
		System.out.println("Enter y: ");
		p4.y = sc.nextDouble();
	}
	if((p1.x>=0 && p1.x<=50) && (p1.y>=0 && p1.y<=50) && (p2.x>=0 && p2.x<=50)&& (p2.y>=0 && p2.y<=50)&&(p3.x>=0 && p3.x<=50)&&(p3.y>=0 && p3.y<=50)&&(p4.x>=0 && p4.x<=50)&&(p4.y>=0 && p4.y<=50)){	
		System.out.println("\nCoordinates successfully assigned!!!");
	}
	else{
		System.out.println("\nCoordinates not as expected (either not in 1st quadrant or greater than 50!!!");
		System.exit(0);
	}
	double findDistance(Point p1,Point p2){
		return (Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)));
	}
	boolean isObeyingPythagorous(double p,double q,double r){
		if(p*p+q*q==r*r || p*p==q*q+r*r || q*q==p*p+r*r)
			return true;
		else
			return false;
	}
	boolean isFormingRectangle(Point A,Point B,Point C,Point D){
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
							System.exit(0);
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
		if(isObeyingPythagorous(d1,d2,d3)){
			System.out.println("Yes they form a rectangle!");
		}
	}

	// double getLength(){
	// 	return x2-x1;
	// }
	// double getBreadth(){
	// 	return y4-y1;
	// }
	// double perimeter(double l,double b){
	// 	return (2*(l+b));
	// }
	// double area(double l,double b){
	// 	return l*b;
	// }
	// boolean isSquare(double l,double b){
	// 	if( l==b )
	// 		return true;
	// 	else
	// 		return false;
	// }
}
class TestRectangle{
	public static void main(String args[]){
		Point A=new Point(2,3);
		System.out.println("Program executed!");
		// Rectangle rec=new Rectangle(4,6,3,1, 0,2,5,3);
		// double length=rec.getLength()>rec.getBreadth()?rec.getLength():rec.getBreadth();
		// double breadth=rec.getLength()<rec.getBreadth()?rec.getLength():rec.getBreadth();
		// System.out.println("Length:"+ length);
		// System.out.println("Breadth:"+breadth);
		// System.out.println("Perimeter: " + rec.perimeter(length,breadth) + " sq.unit" );
		// System.out.println("Area: " + rec.area(length,breadth) + " sq.unit");
		// if(rec.isSquare(length,breadth))
		// 	System.out.println("\nThe given coordinates form a square.");
		// else
		// 	System.out.println("\nThe given coordinates don't form a square.");
	}
}