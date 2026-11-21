package DP;

public class SubsetSumRecursive {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n= arr.length;
    return subsetSumRec(arr ,n ,sum);
        
    }
    static boolean subsetSumRec(int[]arr ,int n ,int sum){
        // Base case
        if(sum == 0) return true;
        
        if(n == 0) return false;
        
        if(arr[n-1] > sum){
            // exclude
            return subsetSumRec(arr ,n-1,sum);
        }
    // else --include || exclude
    return subsetSumRec(arr ,n-1,sum-arr[n-1]) ||
           subsetSumRec(arr,n-1,sum);
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        if (isSubsetSum(arr, sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }
}
