package Easy;

public class LeftRotateArrK {
    public static void LeftRotateByK(int[] arr,int n,int k){
        int x = arr[k-2];
        for (int i = 0; i < n-k; i++) {
            arr[i] = arr[i+k];
        }
        arr[n-k] = x;
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int n=6;
        int arr[]={1, 2, 3, 4, 5, 6};
        int k =2;
        LeftRotateByK(arr, n, k);
    }
}
