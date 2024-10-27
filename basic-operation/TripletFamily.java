import java.util.HashSet;
import java.util.Set;

public class TripletFamily {
     public static boolean findTriplet(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int i:arr)set.add(i);
        
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=i+1;j<arr.length;j++){
                
                if(set.contains(arr[i]+arr[j])) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findTriplet(arr) );
    }
}
