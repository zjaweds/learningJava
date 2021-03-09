import java.util.Scanner;

class PatternOfZeroAndStar{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j <= 2*n; j++){
                if(i==j || j==n || j==(2*n-i))
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            System.out.println(" ");
        }        
    }
}