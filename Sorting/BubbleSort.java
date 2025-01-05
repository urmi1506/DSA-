package Sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int n =  6;
        int arr[]={6 ,2 ,8 ,4 ,1,0};
        bubbleSort( arr,  n) ;
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int[] arr, int n) { 
        // traverse passes from 1 to n-1....traversing whole array  we canalso take i=1 i<n 
    
        for (int i = 0; i < n-1; i++) {
        // for swap element & take n-1-i bcz every time we sorted the largest element and after that their is no need to sort that element j=0 j<n-i
            for (int j = 0; j < n-1-i; j++) {
               if(arr[j]>arr[j+1]) {
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               }
            }
        }

    }

}
