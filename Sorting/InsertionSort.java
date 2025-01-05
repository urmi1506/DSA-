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
            // assume 1st element is already sorted
            for (int i = 1; i < n ; i++) {
                int temp=arr[i];
                int j = i - 1;
                for ( ;j >= 0; j--) {
                    if (arr[j] > temp){
                       arr[j+1]=arr[j];
                    }
                    else{
                        break;
                    }
                }
                arr[j+1]=temp;
                
            }
        }
    }
    

