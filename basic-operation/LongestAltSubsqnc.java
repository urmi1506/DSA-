public class LongestAltSubsqnc {
    public static int alternateSubsequence(int []arr, int n){
        // tracking length of array which is increase alternatively
        int inc=1;
         // tracking length of array which is decrease alternatively
        int dec=1;
        for(int i=0; i<n-1; i++){
           if(arr[i]>arr[i+1]){
            dec=inc+1;
           }else if(arr[i]<arr[i+1]){
            inc=dec+1;
           }
        }
        return Math.max(inc, dec);
    }
    public static void main(String[] args) {
        int n=3;
        int arr[]={1,5,4};
        System.out.println(alternateSubsequence(arr,n));
    }
}
