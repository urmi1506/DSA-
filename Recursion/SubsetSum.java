package Recursion;
import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static boolean isSubsetSum (int [] arr ,int target){
        return print(arr , 0 , arr.length , new ArrayList<>() , target);
    }
    private static boolean print(int [] arr ,int indx ,int n ,List<Integer> ans ,int target){
        // compute curr sum
        int sum =0 ;
        for (int x : ans) sum += x;
        if(sum == target) return true;

        // Base case
        if(indx >= n) return false;

        // include 
        ans.add(arr[indx]);
        if(print(arr, indx+1, n, ans, target)) return true;
        ans.remove(ans.size()-1);

        // exclude
        if(print(arr, indx+1, n, ans, target)) return true;

        return false;
    }
    public static void main(String[] args) {
        int [] arr={1,2,7,3};
        int target=6;
        System.out.println(isSubsetSum(arr, target));
    }
}
