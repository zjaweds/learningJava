import java.util.*;
import java.lang.Math; 

class Area{
static double findArea(double a){
	return 3.14*a*a;
}
static double findArea(double a, double b){
	return a*b;
}
static double findArea(double a,double b,double c){
	double s=(a+b+c)/2;
	return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
}
}
class TestFindArea{
	public static void main(String[] args){
	System.out.println(Area.findArea(2));
	System.out.println(Area.findArea(2,3));
	System.out.println(Area.findArea(2,3,4));
}
}