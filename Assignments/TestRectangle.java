class Rectangle{
	private int x1,x2,x3,x4,y1,y2,y3,y4;
	Rectangle(int a1,int a2, int a3, int a4, int b1, int b2, int b3, int b4){
		set(a1,a2,a3,a4, b1, b2, b3, b4);
	}
	void set(int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4){
		if((a1>=0 && a1<=50) && (a2>=0 && a2<=50) && (a3>=0 && a3<=50)&& (a4>=0 && a4<=50)&&(b1>=0 && b1<=50)&&(b2>=0 && b2<=50)&&(b3>=0 && b3<=50)&&(b4>=0 && b4<=50)){	
			x1=a1;
			x2=a2;
			x3=a3;
			x4=a4;
			y1=b1;
			y2=b2;
			y3=b3;
			y4=b4;
			System.out.println("\nCoordinates successfully assigned!!!");
		}
		else
		{
			System.out.println("\nCoordinates not as expected (either not in 1st quadrant or greater than 50!!!");
			System.exit(0);
		}
		if((a1==a2)&&(a2==a3)&&(a3==a4)&&(b1==b2)&&(b2==b3)&&(b3==b4)){
			System.out.println("The coordinates does not form a rectangle :/");
			System.exit(0);
		}
		if (((slope(x1,y1,x2,y2)*slope(x2,y2,x3,y3))==-1) && ((slope(x3,y3,x4,y4)*slope(x4,y4,x1,y1))==-1)){
			System.out.println("The coordinates form a rectangle :)");
		}
		else if((a2==a3) && (a1==a4)){
			if((b1==b2) && (b3==b4))
				System.out.println("The coordinates form a rectangle :)");
		}
		else{
			System.out.println("The coordinates does not form a rectangle :/");
			System.exit(0);
		}
	}		
	double slope(double x1, double y1, double x2, double y2){
		return (y2-y1)/(x2-x1);
	}
	double getLength(){
		return x2-x1;
	}
	double getBreadth(){
		return y4-y1;
	}
	double perimeter(double l,double b){
		return (2*(l+b));
	}
	double area(double l,double b){
		return l*b;
	}
	boolean isSquare(double l,double b){
		if( l==b )
			return true;
		else
			return false;
	} 
}
class TestRectangle{
	public static void main(String args[]){
		Rectangle rec=new Rectangle(4,6,3,4, 0,2,5,3);
		double length=rec.getLength()>rec.getBreadth()?rec.getLength():rec.getBreadth();
		double breadth=rec.getLength()<rec.getBreadth()?rec.getLength():rec.getBreadth();
		System.out.println("Length:"+ length);
		System.out.println("Breadth:"+breadth);
		System.out.println("Perimeter: " + rec.perimeter(length,breadth) + " sq.unit" );
		System.out.println("Area: " + rec.area(length,breadth) + " sq.unit");
		if(rec.isSquare(length,breadth))
			System.out.println("\nThe given coordinates form a square.");
		else
			System.out.println("\nThe given coordinates don't form a square.");
	}
}