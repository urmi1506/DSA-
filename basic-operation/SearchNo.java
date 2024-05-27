public class SearchNo {
    public static void main(String[] args) {
        int n = 5;
        int k = 16;
        int arr[] = {9, 7, 2, 16, 4} ;
        System.out.println(search(arr,  n,  k) );
    }
    public static int search(int arr[], int n, int k) {

        for (int i = 0; i < n; i++) {
        if(arr[i]==k)
         return i+1;
     }
     return -1;  
    }
}
