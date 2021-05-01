import java.util.*;
import java.lang.*;


class KeySearcher extends Thread{
    public void findKey(int key,int A[], int start, int end){
        int i=0;
        while(start<=end){
            if(A[i]==key)
                return;
        }
        return;
    }
    public void run(){
        int A[]= {2,3,4,5};
        // findKey(0,int [] A,0,0);
        System.out.print("He.");
    }
}

class Assignment4Multithreading{
    public static void main(String []a){
        System.out.println("Enter the size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int A[] = new int [arraySize];

        KeySearcher k= new KeySearcher();
        k.start();
        try{
            k.join();
        }
        catch(Exception e){}
    }
}