import java.util.*;
class ComplexNumbers{
    double real,imag;
    public void setter(double a, double b){
        real=a;
        imag=b;
    }
    public void getter(){
        Scanner inp= Scanner(System.in);
        System.out.println("Enter real part: ");
        double a= inp nextDouble();
        System.out.println("Enter imaginary part: ");
        double b=inp nextDouble();
    }
    private static ComplexNumbers add(ComplexNumbers A, ComplexNumbers B){
           ComplexNumbers sum = new ComplexNumbers();
           sum.real = A.real + B.real;
           sum.imag = A.imag + B.imag;
           return sum;
    }
    public static void main{
        ComplexNumbers first=new ComplexNumbers();
        ComplexNumbers second=new ComplexNumbers();     
    }
}


class ComplexNumber{
    int real, imaginary;
    void setValues(int r, int i){
        real=r;
        imaginary=i;
    }
    int getReal() {
        return real;
    }
    int getImaginary() {
        return imaginary;
    }
    void display(){
        System.out.println(real+"+"+imaginary+"i");
    }
    ComplexNumber addComplexNumber(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res=new ComplexNumber();
        int r=n1.getReal()+n2.getReal();
        int i=n1.getImaginary()+n2.g
Sir, complete code paste ni hora isme
Khalid Raza2:10 PM
Good
add() will take one Complex object only.
ComplexNumber addComplexNumber(ComplexNumber n)
Khalid Raza2:11 PM
@Bilal, have you got my point ?
We can invoke it like
c3 = c1.addComplexNumber(c2)