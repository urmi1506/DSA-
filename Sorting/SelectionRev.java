package Sorting;

/*NOTES : Find the smallest element and swap it with the first.
Then find the next smallest and swap with the second.
Repeat until all elements are in the correct position. */

public class SelectionRev {
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // find min
            int min_indx= i; 
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_indx]) min_indx =j;
            }

            int temp = arr[i];
            arr[i] = arr[min_indx];
            arr[min_indx] = temp;
            
        }
    }
    public static void main(String[] args) {
        int arr[] ={64, 25, 12, 22, 11};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
