public class SearchEleOfSortArr {
    public static void main(String[] args) {
        int N = 5;
        int K = 6;
         int arr[] = {1,2,3,4,6};
         System.out.println(searchInSorted( arr,  N,  K));
    }
     static int searchInSorted(int arr[], int N, int K) {
        // for sorted array BINARY SEARCH is optimize sol
        int low = 0;
        int high = N - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] == K) {
                return 1; // Element found
            } else if (arr[mid] < K) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
    
        return -1; // Element not found
    }

}
// another way but it is not optimized for sorted array
/*  int searchInSorted(int arr[], int N, int K) 
 { 
    for (int i = 0; i < N; i++) {
        if(arr[i]==K)
         return 1;
     }
     return -1;  
 }*/
