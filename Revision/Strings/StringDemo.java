class StringObjects{
    public StringObjects(){
        System.out.println("String objetcs class object instantiated");
    }
}


 class StringDemo {

    // StringObjects beta= new StringObjects();
    // beta="Beta is also chosen as constant often"; 
    static String alpha="Alpha is often chosen as a constant in mathematics and physics";
    public static void main(String [] a){
        System.out.println("Hello");
        StringObjects beta= new StringObjects();
        System.out.println(alpha+" Length of alpha is: "+alpha.length());
        System.out.println("Char at 4th index is: "+ alpha.charAt(4));
        System.out.println(beta);
    }    
}
