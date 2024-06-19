package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PerfectSumAdv {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {5, 2, 3, 10, 6, 8};
        int sum = 8;
        List<Integer> currentSubset = new ArrayList<>();
        boolean found = findSubsets(arr, n, 0,sum, 0, currentSubset);
        if (!found) {
            System.out.println("No subset found.");
        }
    }

    static boolean findSubsets(int[] arr, int n, int psum,int sum, int ind, List<Integer> currentSubset) {
        // Base case
        if (ind >= n) {
            if (psum == sum) {
                System.out.println(currentSubset);
                return true;
            }
            return false;
        }

        // Include 
         currentSubset.add(arr[ind]);
         psum+=arr[ind];
       if(findSubsets(arr, n,psum, sum, ind + 1, currentSubset)==true){
        return true;
       }
          psum-=arr[ind];
         currentSubset.remove(currentSubset.size() - 1); // backtrack

        // Exclude 
        if(findSubsets(arr, n,psum, sum, ind + 1, currentSubset)==true){
            return true;
        }

        return false;
    }
}
