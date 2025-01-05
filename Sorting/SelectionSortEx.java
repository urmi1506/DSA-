package Sorting;
public class SelectionSortEx {
    
        public static void main(String[] args) {
            int n = 5;
            int arr[] = {6, 2, 8, 4, 10};
            selectionSort(arr, n);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    // Method to find the index of the minimum element in the array
       static int select(int arr[], int i) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            return min;
        }
     // Method to perform selection sort on the array
        static void selectionSort(int arr[], int n) {
            for (int i = 0; i < n - 1; i++) {
                int minimum = select(arr, i);
                int t1 = arr[minimum];
                arr[minimum] = arr[i];
                arr[i] = t1;
            }
        }
    }
    

