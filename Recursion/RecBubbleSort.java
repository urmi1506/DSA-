package Recursion;

public class RecBubbleSort {
    
        public static void bubbleSortRecursive(int[] arr, int n) {
            // Base case: If the array size is 1, return
            if (n == 1) {
                return;
            }
            
            // One pass of bubble sort. After this pass, the largest element is moved to the end.
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            
            // Largest element is fixed, recur for the remaining array
            bubbleSortRecursive(arr, n - 1);
        }
    
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            
            bubbleSortRecursive(arr, arr.length);
            
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    

