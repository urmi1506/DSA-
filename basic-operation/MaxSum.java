public class MaxSum {
    public static int pairWithMaxSum(int[] arr) {
        if(arr.length==1)return -1;
       int res=0;
       for(int i=0;i<arr.length-1;i++){
           res=Math.max(res,arr[i]+arr[i+1]);
       }
       
       return res;
   }
   public static void main(String[] args) {
    int []arr ={4, 3, 1, 5, 6};
    System.out.println(pairWithMaxSum(arr));
   }
}
