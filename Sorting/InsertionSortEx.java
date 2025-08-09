package Sorting;

public class InsertionSortEx {
    public static void insertionSort(int []arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            // peak element to place it in correct pos
            int temp=arr[i];
            int j=i-1;
            // shift larger element to right
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            // place peak element at correct postion
            arr[j+1]=temp;

        }
    }
    public static void main(String[] args) {
        int []arr={4, 1, 3, 9, 7};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
