import java.util.ArrayList;

public class MultiplicationTable {
    public static void main(String[] args) {
        int N=9;
        System.out.println(getTable(N));
    }
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> a1= new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            a1.add(i*N);
        }
        return a1; 
    }
}
