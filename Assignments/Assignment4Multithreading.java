import java.util.*;
import java.lang.*;
import java.util.Random;

class KeySearcher extends Thread{
    long A[];
    long key;
    int start,end;    
    //findKey definition
    public boolean findKey(long key,long A[], int start, int end){
        int i=0;
        while(start<end){
            if(A[i]==key)
                return true;
            i++;
            start++;
        }
        return false;
    }
    
    //Constructor is required for KeySearcher(int A[])
    public KeySearcher(long A[],int start, int end,long key){
        A =A;
        this.key = key;
        this.start = start;
        this.end = end;
    }
    public void run(){
        System.out.print(findKey(key,A,start,end)+" Time taken: ");
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
        System.out.print("\nEnter the key: ");
        long key = sc.nextLong();
        if(arraySize%numberOfThreads==0){
            int lengthOfSubArray = arraySize%numberOfThreads;
            int span=0;
            int initial=0;
            int terminal=lengthOfSubArray;
            for(int j=0; j<numberOfThreads; j++){
                KeySearcher k= new KeySearcher(A ,initial+span,terminal+span,key);
                long start = System.nanoTime( );
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
                long end = System.nanoTime( );
                System.out.println(end - start);
                span+=lengthOfSubArray;
            }
        }
        else{
            int lengthOfSubArray = ((int)arraySize%numberOfThreads)+1;
            int span=0;
            int initial=0;
            int terminal=lengthOfSubArray;
            for(int j=0; j<numberOfThreads; j++){
                KeySearcher k= new KeySearcher(A ,initial+span,terminal+span,key);
                long start = System.nanoTime( );
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
                long end = System.nanoTime( );
                System.out.println(end - start);
                span+=lengthOfSubArray;
            }   
        }
    }
}