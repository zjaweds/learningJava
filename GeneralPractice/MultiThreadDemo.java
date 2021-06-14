import java.util.ArrayList;

class ThreadForPrimes extends Thread{
    public void run(){
        // static void prime_N(int N){
            int N = 99999999;
            // prime_N(N);
            int x, y, flg;
            System.out.println("All the Prime numbers within 1 and " + N + " are:");
            for (x = 1; x <= N; x++) {
                if (x == 1 || x == 0)
                    continue;
                flg = 1; 
                for (y = 2; y <= x / 2; ++y) {
                    if (x % y == 0) {
                        flg = 0;
                        break;
                    }
                }
                if (flg == 1)
                    System.out.println("Prime thread: "+x);
            }
        }
}

class ThreadForFibonacci extends Thread{
    public void run(){
    long n1=0,n2=1,n3,i,count=40;    
    System.out.print(n1+" "+n2);//printing 0 and 1       
    for(i=2;i<count;++i){//loop starts from 2 because 0 and 1 are already printed    
        n3=n1+n2;    
        System.out.println("Fibonacci Thread: "+ n3);    
        n1=n2;    
        n2=n3;
        if(n3 / 10000000 > 1)
            break;    
        }
    }
}

class MultiThreadDemo{
    public static void main(String [] ar){
        ThreadForPrimes t1 = new ThreadForPrimes();
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){}
        // t1.display();
        ThreadForFibonacci t2 = new ThreadForFibonacci();
        t2.start();
        // try{
        //     t2.join();
        // }
        // catch(Exception e){}
        // t2.display();       
    }
}