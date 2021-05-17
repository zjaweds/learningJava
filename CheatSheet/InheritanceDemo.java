class Building{
    int numberOfRooms;
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
    }
 }