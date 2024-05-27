public class SwapAltArr {
    public static void main(String[] args) {
        int n=5;
        int arr[]={ 2,5,7,8,72,33};
       swap_alt_array( arr, n);
       for (int i = 0; i < n; i++) {
         System.out.println(arr[i]);
       }
    }
    public static void swap_alt_array(int arr[],int n){
        
        for (int i = 0; i < n; i+=2) {
            if (i+1 < n){
           int t1=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t1;
        }
    }
    
}
}
