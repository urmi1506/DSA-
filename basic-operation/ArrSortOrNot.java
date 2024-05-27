public class ArrSortOrNot {
    public static void main(String[] args) {
        int n=5;
        int[] arr= {10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot( arr, n));
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        // Traverse array
        for(int i=0; i<n-1; i++) 
        // case for not sort array
        if(arr[i]>arr[i+1]) 
        return false;
        return true;
 }
}
