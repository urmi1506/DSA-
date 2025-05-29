package Sorting;

/*  NOTE : Repeatedly compare adjacent elements and swap them if they are in the wrong order.

After each pass, the largest unsorted element moves to its correct position (bubbles to the top). */


public class BubbleRev {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
           for(int j =0 ; j < n-1-i ; j++){
              if (arr[j] > arr [j+1]){
                int temp = arr [j] ;
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
              }
           }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,3} ;
        bubblesort( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
