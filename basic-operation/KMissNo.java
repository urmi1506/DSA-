public class KMissNo {
    public static int kthMissing(int[] arr, int k) {
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11}, k = 5;
        System.out.println( kthMissing( arr,  k));
    }
}
