package Hard;
import java.util.*;
public class ThreeSum2 {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            // skip duplicates
            if(i > 0 && arr[i] == arr   [i-1])
               continue;

            int j=i+1;
            int k=arr.length - 1;

            while(j < k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum > 0)
                   k--;
                
                else if(sum <0)
                    j++;

                else{
                    res.add(Arrays.asList(arr[i] ,arr[j] ,arr[k]));
                    j++;

                    while(arr[j] == arr[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
    return res;  
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
