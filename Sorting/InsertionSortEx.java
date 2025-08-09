package Sorting;

public class InsertionSortEx {
    public static void insertionSort(int []arr){
        int n= arr.length;
        // Assume 1st element is sorted
        for(int i=1; i<n; i++){
            // peak element
            int temp=arr[i];
            int j=i-1;
            // shift larger element at right ..compare peak ele with curr ele
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            // place element at correct pos
            arr[j+1]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
