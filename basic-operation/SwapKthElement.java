public class SwapKthElement {
    public static void main(String[] args) {
     int n=8;
     int arr[]={1,2,3,4,5,6,7,8};
     int k=3;
     swapKth(arr,n,k);   

    }
    static void  swapKth(int arr[], int n, int k) {
        int t1;
        t1=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=t1;

    }
}
