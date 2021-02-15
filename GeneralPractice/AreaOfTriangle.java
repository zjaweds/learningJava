import java.util.*;
import java.lang.Math; 

class AreaOfTriangle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double s1,s2,s3;
        System.out.println("Enter side 1:");
        s1=sc.nextDouble();
        System.out.println("Enter side 2:");
        s2=sc.nextDouble();
        System.out.println("Enter side 3:");
        s3=sc.nextDouble();
        sc.close();
        if(s1+s2>=s3||s1+s3>=s2||s3+s2>=s1){
            System.out.println("A triangle.");
            double s;
            s=(s1+s2+s3)/2.0;
            double a=s*(s-s1)*(s-s2)*(s-s3);
            System.out.println("Area is: "+ Math.sqrt(a));
        }
        else{
            System.out.println("Not A triangle.");
            System.exit(0);
        }
    }
}