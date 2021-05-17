import java.lang.String.*;
import java.lang.String.concat.*;

class Building{
    public int numberOfRooms=20;
    int numberOfLadders;
    int numberOfElevators;
    int numberOfPassages;
    int numberOfFloors;
    double surfaceArea; //View from directly above the buliding
    double buildHeight;
    public Building(){

    }
}

interface BuildingShape{
    void getShape();
}

class HallShape implements BuildingShape{
    public void getShape(){
        System.out.println("What my shape is?");
    }
}

abstract class ColourSpecs{
    abstract void getColor();
}

class ColorOfHall extends ColourSpecs{
    void getColor(){
        System.out.println("What color do I have?");
    }
}

class SeminarHall extends Building{
    public SeminarHall(){
        this.numberOfFloors=0;
    }
    public void findAttributes(){
        System.out.println(this.numberOfFloors+" floors.");
        System.out.println(this.numberOfRooms+" rooms.");
        System.out.println(this.numberOfElevators+" elevators.");
        System.out.println(this.numberOfPassages+" passages.");
        System.out.println(this.numberOfLadders+" ladders.");
    }
}

class ElementPrinter{
    static void printSequence(){
        double ar[] = new double[10];
        for(int i=1; i<ar.length; i++){
            ar[i]= (i*i+i)/i;
        }
        System.out.println("------------------Array elements------------------");
        for(double x:ar){
            System.out.println(x);
        }
        System.out.println("------------------Array elements------------------");
    }
}

class CharPrinter{
    void printCharacters(){
        String str = new String();
        for(int i=65; i<150;i++){
            str[i] =((char)i);
        }
        System.out.println("------------------String elements------------------");
        for(int c;c<=str.length();c++){
            System.out.println(str.charAt(c));
        }
        System.out.println("------------------String elements------------------");
    }
}

class InheritanceDemo{
    public static void main(String a[]){
        SeminarHall seminarHall1 = new SeminarHall();
        seminarHall1.numberOfRooms=10;
        System.out.println("I'm from the seminar Hall.");
        System.out.println("My specifications:--- ");
        seminarHall1.findAttributes();
        ColorOfHall hc = new ColorOfHall();
        hc.getColor();
        HallShape hs = new HallShape();
        hs.getShape();
        ElementPrinter.printSequence();
        CharPrinter cp = new CharPrinter();
        cp.printCharacters();
    }
 }