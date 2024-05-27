public class ArrSortRec {
    public static void main(String[] args) {
        int n=5;
        int[]arr={1,2,3,4,5};
        System.out.println(issorted(n-1, arr));
    }
    static boolean issorted(int n,int []arr){
       if(n==0 || n==1)
       return true;
       if(arr[n-1]>=arr[n]){
        return false;
       }
       else{
        boolean ans=issorted(n-1 , arr);
        return ans;
       }
    }
}
