import java.util.Scanner;

class ReadALine {    
    public static void main (String[] args) {
	       Scanner ipObj = new  Scanner(System.in);
           System.out.println("Enter a line: ");
           String line1 = ipObj.nextLine();
           System.out.println(line1);
           System.out.println("Enter another line: ");
           String line2 = ipObj.nextLine();
           System.out.println(line2);
 	}
}