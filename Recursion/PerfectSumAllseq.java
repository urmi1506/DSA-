package Recursion;
import java.util.*;
public class PerfectSumAllseq {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {5, 2, 3, 10, 6, 8};
        int sum = 8;
        List<Integer> ans = new ArrayList<>();
        print(arr, n, 0, 0, sum, ans);
    }
    static void print(int []arr,int n,int ind,int psum,int sum ,List<Integer>ans){
        if(ind>=n){
            if(psum==sum){
                System.out.println(ans);
            }
        return;
        }
        /* here we also use boolean data type and declare here "boolean found=false" add in || with both include and exclude condition*/
        //include
        ans.add(arr[ind]);
        psum+=(arr[ind]);
        print(arr, n, ind+1, psum, sum, ans);
        // backtrack
        psum-=(arr[ind]);
        ans.remove(ans.size()-1);
        // exclude
        print(arr, n, ind+1, psum, sum, ans);
    }
}
