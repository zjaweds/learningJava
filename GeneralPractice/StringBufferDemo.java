import java.io.*; 

class TestStringBuf{
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer(10);
        System.out.println("sb: "+ sb);
        System.out.println("sb.length(): "+ sb.length());
        System.out.println("sb.capacity(): "+ sb.capacity());
    }
}