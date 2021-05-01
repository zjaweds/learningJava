import java.util.*;
import java.lang.*;
import java.util.Random;

class KeySearcher extends Thread{
    public void findKey(int key,int A[], int start, int end){
        int i=0;
        while(start<=end){
            if(A[i]==key)
                return;
            start++;
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
        long A[] = new long [arraySize];
        Random randomNumber = new Random();
        for(int i=0;i<arraySize;i++){
            A[i]=(long)(randomNumber.nextDouble()*10000000000L);
            System.out.print(A[i]+" ");
        }
        System.out.print("\nEnter the number of threads: ");
        int numberOfThreads = sc.nextInt();
        if(arraySize%numberOfThreads==0){
            int lengthOfSubArray = arraySize%numberOfThreads;
            for(int j=0; j<lengthOfSubArray; j++){
                KeySearcher k= new KeySearcher();
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
            }
        }
        else{
            int lengthOfSubArray = ((int)arraySize%numberOfThreads)+1;
            for(int j=0; j<lengthOfSubArray; j++){
                KeySearcher k= new KeySearcher();
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
            }   
        }
    }
}