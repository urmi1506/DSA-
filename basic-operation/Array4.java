public class Array4 {
   public static void main(String[] args) {
    int n = 4;
    int arr[] = {2, 3, 5, 5};
    printArray(arr, n);
   } 
   static void printArray(int arr[], int n) {
    
    for(int i=0;i<n;i++)
       System.out.print(arr[i]+" ");
}
}
