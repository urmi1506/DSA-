package Sorting;
public class InsertionSort {
    
        public static void main(String[] args) {
            int n = 5;
            int arr[] = {6, 2, 8, 4, 10};
            insertionSort(arr, n);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    
        public static void insertionSort(int arr[], int n) {
            // Assume 1st element is already sorted
           for(int i=1 ; i<n; i++){
            //  curr ele
            int key = arr[i];
            // check left side
            int j=i-1;

            // if left ele bigger than curr 
            while( j >= 0 && arr[j] > key) {
                // shift right
                arr[j + 1] = arr[j];
                j--;
            }
            // place it to curr pos
            arr[j+1] = key;
           }
        }
        
    }
    

