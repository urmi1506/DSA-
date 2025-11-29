package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ComboSum1 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 8;
        System.out.println(combinationSum( candidates,  target));
    }
    public static void solve(int[] arr, int target, int idx, List<List<Integer>> res,List<Integer> list){
        if(idx==arr.length){
            if(target==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            solve(arr, target-arr[idx], idx, res, list);
            list.remove(list.size()-1);
        }
        solve(arr, target, idx+1, res, list);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(candidates, target,0, res, list);
        return res;
    }
}
