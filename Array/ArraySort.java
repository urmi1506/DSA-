package Array;

public class ArraySort {
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
            if(arr[i] > arr[i+1])return false;
            return true;
            
    }
    public static void main(String[] args) {
        int[] arr ={3,3,6,5};
        System.out.println(isSorted(arr));
    }
}
