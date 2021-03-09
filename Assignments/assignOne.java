import java.util.*;
import java.lang.*;

class rectangle
{
   float x1, x2, x3, x4;
   float y1, y2, y3, y4;
   double AB, BC, CD, DA, AC;
   double perimeter, area, length, width; 
   int k1,k2;
   
   rectangle(float x1, float x2, float x3, float x4, float y1, float y2, float y3, float y4)
     {

       this.x1=x1;
       this.x2=x2;
       this.x3=x3;
       this.x4=x4;
       this.y1=y1;
       this.y2=y2;
       this.y3=y3;
       this.y4=y4;
     }
     
     void validatePoint()
     {
     if((x1<0.00 || x1>50.00) || (y1<0.00 || y1>50.00) || (x2<0.00 || x2>50.00) || (y2<0.00 || y2>50.00) || (x3<0.00 || x3>50.00) || (y3<0.00 || y3>50.00) || (x4<0.00 || x4>50.00) || (y4<0.00 || y4>50.00))
        {
          System.out.println("coordinates are not in first qaudrant. EXit....");
          System.exit(1);
        }
        
     }
     
     void display()
      {
         System.out.print("coordinate of W is :");
         System.out.print(x1 );
         System.out.println(" , "+y1 );
         System.out.print("coordinate of X is :");
         System.out.print(x2 );
         System.out.println(" , "+y2 );
         System.out.print("coordinate of Y is :");
         System.out.print(x3 );
         System.out.println(" , "+y3 );
         System.out.print("coordinate of Z is :");
         System.out.print(x4 );
         System.out.println(" , "+y4 );   
      }
     
   
   int checkRectangle()
        {
      //   System.out.print("Distance between A and B : ");
           AB=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      //   System.out.println(AB);
     
      //   System.out.print("Distance between B and C : ");
           BC=((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
      //   System.out.println(BC);
     
      //   System.out.print("Distance between C and D : ");
           CD=((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
      //   System.out.println(CD);
     
      //   System.out.print("Distance between D and A : ");
           DA=((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
      //   System.out.println(DA);
      
           AC=((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));    //finding the length of diagonal
      //   System.out.println(AC);
      
      
      /*
           if(AC==AB+BC) // diagonal AC divides the rectangle into two right triangle 
              {
                 k1=1;
                 System.out.println("Given coordinates form rectangle.");
              } 
           else
              {  
                 k1=0;
                 System.out.println("Given coordinates aren't form rectangle.");
              } 
         return k1; }
         
      */
         
           if(AC==AB+BC) // diagonal AC divides the rectangle into two right triangle 
              {
                 k1=1;
                 System.out.println("Given coordinates form rectangle.");
              } 
           else
              {  
                 k1=0;
                 System.out.println("Given coordinates aren't form rectangle.");
              } 
         return k1; }
   

   void getLength()
        {
           length=Math.sqrt(AB);
           System.out.println("Length of rectangle is : "+length);
        }
   
   void getWidth()
        {
           width=Math.sqrt(BC);
           System.out.println("Width of rectangle is : "+width);
        }
        
        
   void getPerimeter()
        {
          perimeter=2*(length+width);
          System.out.println("Perimeter of rectangle is : "+perimeter); 
        }
    
   void getArea()
        {
          area=length*width;
          System.out.println("Area of rectangle is : "+area);
        } 
     

}
      
class assignOne{
   
public static void main(String args[])
  {
     
     float x1, x2, x3, x4;
     float y1, y2, y3, y4;
     double AB, BC, CD, DA, AC;
     double perimeter, area, lenght, width; 
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter the coordinates of A");
     x1= scan.nextFloat();
     
     y1= scan.nextFloat();
     
     System.out.println("Enter the coordinates of B");
     x2= scan.nextFloat();
     y2= scan.nextFloat();
     
     System.out.println("Enter the coordinates of C");
     x3= scan.nextFloat();
     y3= scan.nextFloat();
     
     System.out.println("Enter the coordinates of D");
     x4= scan.nextFloat();
     y4= scan.nextFloat();
     
     rectangle rec=new rectangle(x1,x2,x3,x4,y1,y2,y3,y4);
     rec.validatePoint();
     
     
     rec.display();    
     //rec.checkRectangle(); 
   if(rec.checkRectangle()==1)
   {
     rec.getLength();
     rec.getWidth(); 
     rec.getPerimeter();
     rec.getArea();
    }  
    else 
    {
    System.out.println("Please enter valid rectangle coordinates");
    }
  }  
}





