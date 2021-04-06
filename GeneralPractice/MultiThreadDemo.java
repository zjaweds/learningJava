import java.util.ArrayList;

class Thread1 extends Thread{
    ArrayList <Integer> l1 = new ArrayList();
    public Thread1(ArrayList l){
        this.l1=l;
    }
    public void run(){
        int low = 1, high = 100000;
        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                l1.add(low);
            ++low;
        }
    }
    public void display(){
        for(int i=0; i < l1.size(); i++){
            System.out.println("Prime: "+ l1.get(i)+" " );
        }
    }
}

class Thread2 extends Thread{
    ArrayList <Integer> l1 = new ArrayList();
    public Thread2(ArrayList l){
        this.l1=l;
    }
    public void run(){
        int max = 100000; 
		 int first = 1;
		 int next = 2;
         int sum=first;
	    while (sum<max){
            l1.add(sum);
            sum = first + next;
            first = next;
            next = sum;
        }
    }
    public void display(){
        for(int i=0; i < l1.size(); i++){
            System.out.println("Fibonacci: "+ l1.get(i)+" " );
        }
    }
}

class MultiThreadDemo{
    public static void main(String [] ar){
        ArrayList <Integer> a = new ArrayList();
        ArrayList <Integer> b = new ArrayList();
        Thread1 t1 = new Thread1(a);
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){}
        t1.display();
        Thread2 t2 = new Thread2(b);
        t2.start();
        try{
            t2.join();
        }
        catch(Exception e){}
        t2.display();       
    }
}