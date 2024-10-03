import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityVote {
    // Function to find the majority elements in the array
    public static List<Integer> findMajority(List<Integer> nums) {
        List<Integer> res = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if( entry.getValue()>(nums.size()/3)){
                res.add(entry.getKey());
            }
        }
        if(res.size()==0) res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        List<Integer> nums =  Arrays.asList(2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6);
        System.out.println(findMajority(nums));
    }
}


