public class KadaneAlgo {
    public static int maxSubarraySum(int arr[]){
        int sum=0;
        // initially maxi=min val
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // cal sum of each element of array
            sum+=arr[i];
            // cal Max Sum
            maxi=Math.max(maxi, sum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, -2, 5};
        System.out.println( maxSubarraySum(arr));
    }
}
