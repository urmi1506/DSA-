package Medium;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class MergeInterval {
     public static int[][] merge(int[][] intervals) {
        int n=intervals.length;
        // sort & compare
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        // store ans
        List<int[]> res =new ArrayList<>();
        // Traverse & merge
        int []curr = intervals[0]; // 1-D arr bcz we compare 1 arr at a time
        for(int i=1; i<n; i++){
            // Find overalapping
            if(intervals[i][0] <= curr[1]){
                curr[1]=Math.max(curr[1] , intervals[i][1]);
            }
            // no overalapping
            else{
                res.add(curr);
                curr=intervals[i];
            }
        }
         // add remaining
            res.add(curr);
            int[][]ans=new int[res.size()][];
            ans=res.toArray(ans);
            return ans;
    }
    public static void main(String[] args) {
        int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=merge(intervals);
        for(int i=0; i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
