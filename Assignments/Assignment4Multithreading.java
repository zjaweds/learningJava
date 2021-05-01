import java.util.*;
import java.lang.*;
import java.util.Random;

class KeySearcher extends Thread{
    //Constructor is required for KeySearcher(int A[])
    public void findKey(long key,int A[], int start, int end){
        int i=0;
        while(start<=end){
            if(A[i]==key)
                return;
            start++;
        }
        return;
    }
    public KeySearcher(long A[],int start, int end,long key){
        
    }
    public void run(){
        int A[]= {2,3,4,5};
        findKey(4,A,0,3);
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
        System.out.print("\nEnter the key: ");
        long key = sc.nextLong();
        if(arraySize%numberOfThreads==0){
            int lengthOfSubArray = arraySize%numberOfThreads;
            for(int j=0; j<numberOfThreads; j++){
                KeySearcher k= new KeySearcher(A ,0,lengthOfSubArray,key);
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
            }
        }
        else{
            int lengthOfSubArray = ((int)arraySize%numberOfThreads)+1;
            for(int j=0; j<numberOfThreads; j++){
                KeySearcher k= new KeySearcher(A ,0,lengthOfSubArray,key);
                k.start();
                try{
                    k.join();
                }
                catch(Exception e){}
            }   
        }
    }
}