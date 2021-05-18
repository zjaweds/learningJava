import java.util.*;

class RandomsInSet{
    public static void main(String[] a){
        TreeSet<int> tsInteger = new TreeSet<int>();
        HashSet<int> hsInteger = new HashSet<int>();
        for (int i = 0; i < 10000; i++) {
			int x = (int)(Math.random());
			tsInteger.add(x);
            hsInteger.add(x);
		}
        // Java.util.TreeSet.contains()
        Iterator<int> i = tsInteger.iterator();
        while (i.hasNext()){
            double tTsStart =System.currentTimeMillis();
            tsInteger.contains(20);
            double tTsEnd =System.currentTimeMillis();
        }

        Iterator<int> j = hsInteger.iterator();
        while (j.hasNext()){
            double tHsStart =System.currentTimeMillis();
            hsInteger.contains(20);
            double tHsEnd =System.currentTimeMillis();
 
        }
        System.out.println(tTsStart-tTsEnd );
        System.out.println( tHsStart-tHsEnd);
    }
}