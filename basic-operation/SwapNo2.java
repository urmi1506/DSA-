import java.util.ArrayList;
import java.util.List;

public class SwapNo2 {
    
public static void main(String[] args) {
    int a=13;
    int b=9;
    System.out.println(get(a,b));
}
    static List<Integer> get(int a,int b)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        arr.add(a);
        arr.add(b);
        return arr;
    }
}
