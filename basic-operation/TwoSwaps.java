import java.util.List;
import java.util.Arrays;

public class TwoSwaps {
    public static boolean checkSorted(List<Integer> arr) {
        int cnt=0;
        int i=0;
        while(i<arr.size()){
            if(arr.get(i)!=i+1){
                int temp=arr.get(i)-1;
                int flag=arr.get(i);
                arr.set(i,arr.get(temp));
                arr.set(temp,flag);
                cnt++;
            }else{
                i++;
            }
        }
        if(cnt==2 || cnt==0)    return true;
        return false;
    }
    public static void main(String[] args) {
        List<Integer>arr = Arrays.asList(4, 3, 2, 1);
        System.out.println(checkSorted(arr));
    }
}
