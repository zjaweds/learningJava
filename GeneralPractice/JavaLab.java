import java.util.*;

class BooleanMatrix{
    int nodes;
    int [][] graphMatrix = new int [nodes][nodes];
    public BooleanMatrix(int x){
        nodes=x;
    }
    public void createBooleanMatrix(){
        int [][] graphMatrix = new int [nodes][nodes];
        for(int i=0;i<nodes;i++){
            for(int j=0; j<nodes; j++){
                graphMatrix[i][j]= (int)(Math.random()*(1-0+1));
            }
        }
        for(int i=1;i<nodes;i++){
            for(int j=1; j<nodes; j++){
                System.out.print(graphMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public double findAvgDegree(){
        int connected = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (this.graphMatrix[i][j]==1) {
                    connected++;
                }
            }
        }
        if(nodes!=0)
            return connected/nodes;
        else{
            System.out.println("No connected nodes");
            return 0;
        }
    }
    public int findSelfLoop(){
        int sl= 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.graphMatrix[i][j]==1 && i==j) {
                    sl++;
                }
            }
        }
        return sl;
    }
}


public class JavaLab {
    public static void main(String a[]){
        System.out.println("Enter number of nodes");
        int numberOfNode=0;
        Scanner sc = new Scanner(System.in);
        numberOfNode = sc.nextInt();
        sc.close();
        System.out.println(numberOfNode);
        BooleanMatrix bm = new BooleanMatrix(numberOfNode);
        bm.createBooleanMatrix();
        double x = bm.findAvgDegree();
        System.out.println("Average degree: "+ x);
        int selfloop= bm.findSelfLoop();
        System.out.println("Self loops: "+ selfloop);
    }
}