package DP;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        // store final ans
        int[][] t= new int [n+1][W+1];
        // initially fill with -1
        for(int []r: t){
            Arrays.fill(r ,-1);
        }
    return knapsackRec(W , val ,wt ,n,t);
    }
    private static int knapsackRec(int W , int val[], int wt[], int n,int[][]t){
        // BAse case
        if(n==0 || W== 0) return 0;
        
        // memoization
        if(t[n][W] != -1){
            return t[n][W];
        }
        
        // choice diagram
        if(wt[n-1] <= W){
            return t[n][W] = Math.max(val[n-1] + knapsackRec(W-wt[n-1],val,wt,n-1,t),
            knapsackRec(W,val,wt,n-1,t));
        }
        else{
            return t[n][W] =  knapsackRec(W,val,wt,n-1,t);
        }
    }
    public static void main(String[] args) {
        int W = 4, val[] = {1,2,3}, wt[] = {4,5,1};
        System.out.println(knapsack(W, val, wt));
    }
}
