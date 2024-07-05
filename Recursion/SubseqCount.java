package Recursion;

public class SubseqCount {
    public static void main(String[] args) {
        int n=6;
        int []arr = {5, 2, 3, 10, 6, 8};
        int sum=10;
        System.out.println(count(arr, n, sum, 0, 0));
    }
    static final int MOD = 1000000007;
    static int count(int arr[],int n,int sum,int psum,int ind){
        // Base case 
        if(ind>=n){
            if(psum == sum){
                return 1;
            }
            else{
            return 0;
            }
        }
        //include
        psum+=arr[ind];
        int l=count(arr, n, sum,psum , ind+1);
        //backtrack
        psum-=arr[ind];
        // exclude
        int r=count(arr, n, sum, psum, ind+1);

        return (l+r)%MOD;

    }
    
}
