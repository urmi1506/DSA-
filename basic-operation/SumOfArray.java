public class SumOfArray {
    public static void main(String[] args) {
        int n=4;
        int[] arr={1,2,3,4};
        int a=Sum(arr,n);
        System.out.println("sum of array is"+a);
    }
    public static int Sum(int[]arr,int n){
        if(n<=0){ //edge case
            return 0;
        }
        int ans=0;
        
        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i];//same as ans+=arr[i]
        }
    
      return ans;
    }
    
}
