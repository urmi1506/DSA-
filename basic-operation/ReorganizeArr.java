import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReorganizeArr {
     public static List<Integer> rearrange(List<Integer> arr) {
       HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            set.add(arr.get(i));
        }
        for(int i = 0; i < arr.size(); i++){
            if(set.contains(i)) res.add(i);
            else res.add(-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2, 0, 1};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        System.out.println(rearrange(list));

    }
}
