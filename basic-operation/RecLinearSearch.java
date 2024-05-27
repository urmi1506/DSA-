public class RecLinearSearch {
    public static void main(String[] args) {
        int n=4;
        int []arr={1,2,3,4};
        int k=5;
        boolean ans=search(n, arr, k);
        if(ans){
            System.out.println("element found");
        }
        else{
            System.out.println("not found");
        }
    }
    static boolean search(int n ,int []arr,int k){
        if(n==0)
        return false;
        if(arr[n-1]==k){
            return true;
        }
        return search(n-1,arr,k);
    }
}
