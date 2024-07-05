package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3};
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        print(arr, 0, n, ans);
    }
    static void print(int arr[],int ind,int n,List<Integer>ans){
        //Base Case
        if(ind>=n){
            System.out.println(ans);
            return ;
        }
        //include
        ans.add (arr[ind]);
        print(arr, ind+1, n, ans);
        // backtrack...accessing last element
        ans.remove (ans.size()-1);
        // exclude
        print(arr, ind+1, n, ans);
        
    }
}
