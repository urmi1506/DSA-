public class KthDist {
    public static boolean checkDuplicatesWithinK(int[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<=i+k && j<n ;j++){
               if(arr[i]==arr[j]) return true;
           }
        }
        return false;
   }
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 1, 4, 5} ;
    int k = 3;
    System.out.println(checkDuplicatesWithinK(arr, k));
   }
}
