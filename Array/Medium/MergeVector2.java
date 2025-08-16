package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
// GM

// case:applicable for unsorted array
public class MergeVector2 {
    public static Vector<Integer> merge(Vector<Integer>v1,Vector<Integer>v2){
        
        // v1=new Vector<>(Arrays.asList(1,2,3));
        // v2=new Vector<>(Arrays.asList(9,9,10,11));
        // append v2 to v1
        Vector<Integer> merged=new Vector<>(v1);
        merged.addAll(v2);

        Collections.sort(merged);

        // handled duplicates
        Vector<Integer> unique=new Vector<>();
        for (int val : merged) {
            if(unique.isEmpty() || unique.get(unique.size()-1)!=val){
                unique.add(val);
            }
        }
    return unique;

    }
    public static void main(String[] args) {
        Vector<Integer>v1=new Vector<>(Arrays.asList(1,2,3));
        Vector<Integer>v2=new Vector<>(Arrays.asList(9,9,10,11));
        System.out.println(merge(v1, v2));
    }
}
