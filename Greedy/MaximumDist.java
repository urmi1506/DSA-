package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumDist {
    // Brute Force Solution
    public static int maxDist(List<List<Integer>> arrays){
        int max_Dist=0;
        // for 1st Array
        for (int i = 0; i < arrays.size(); i++) {
            // for 2nd Array
            for (int j = i+1; j < arrays.size(); j++) {
                // compare each element of arr[i] & arr[j]
                for (int num1 : arrays.get(i)) {  // 1st array
                    for (int num2 : arrays.get(j)){  // 2nd array
                        // find distance
                       int Dist=Math.abs(num1-num2);
                        //update maximum distance
                         if(Dist > max_Dist){
                            max_Dist=Dist;
                         }
                    }
                    
                }
            }
        }
        return max_Dist;
    }
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(Arrays.asList(1, 2, 3));  
        arrays.add(Arrays.asList(4, 5));     
        arrays.add(Arrays.asList(1, 2, 3));  

        System.out.println(maxDist(arrays)); 
    }
}
