package Easy;

public class SubarrSum {
    public static int sumK(int[] arr,int k ){
        int n = arr.length;
        // Find len of Array
        int len=0;
        // Find Sub Arrays
        for (int i = 0; i < n; i++) {
             // Find Sum of Array
                int sum =0;
                
            for (int j = i; j < n; j++) {
               

                    sum += arr[j];

                    if(sum == k) len=Math.max(len, j-i+1);
                    
                }
            }
        
        return len;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,5};
        int k =5;
        System.out.println(sumK(arr, k));
    }
}
    