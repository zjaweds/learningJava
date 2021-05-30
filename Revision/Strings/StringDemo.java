import java.util.*;

class StringObjects{
    String str;
    public StringObjects(){
        System.out.println("String objetcs class object instantiated");
    }
    public String Append(String x){
        System.out.println(str+x);
        return str+x;
    }
    public void display(){
        System.out.println(this.str);
    }
}


 class StringDemo {

    // StringObjects beta= new StringObjects();
    // beta="Beta is also chosen as constant often"; 
    static String alpha="Alpha is often chosen as a constant in mathematics and physics";
    public static void main(String [] a){
        System.out.println("Hello");
        StringObjects beta= new StringObjects();
        String gama = beta.Append("California"); 
        beta.Append("California");//It demonstarte that strings are immutable
        System.out.println(alpha+" Length of alpha is: "+alpha.length());
        System.out.println("Char at 4th index is: "+ alpha.charAt(4));
        char[] delta= new char[100];
        alpha.getChars(0,10,delta,2);
        beta.display();
        System.out.println("Gama: "+gama);
        System.out.print("Delta: ");
        System.out.println(delta);
        System.out.println(alpha.equals(gama));
        System.out.println(alpha==gama);
        String s1="Alpha is o";
        String s2="ALPHA is o";
        System.out.println("\n s1 and s2 comparison:+++++++++++++ " +s1.equalsIgnoreCase(s2));
        System.out.println(s1==s2);
        System.out.println(s1.startsWith("lp"));
        System.out.println(s1.endsWith(" o"));
    }    
}
