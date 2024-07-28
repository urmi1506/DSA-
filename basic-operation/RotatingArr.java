public class RotatingArr {
    public static void main(String[] args) {
      int n=7;
      int arr[]={1,2,3,4,5,6,7};
      int d = 2;
      leftRotate( arr, n, d); 
      for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }
    }
    static void leftRotate(int[] arr, int n, int d) {
       int count=1;
       while(count<=d){
        int last=arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[n-1]=last;
        count++;
       }
    }
}
// optimized sol
// class Solution {
//     // Function to perform left rotation on the array
//     void leftRotate(int[] arr, int n, int d) {
//         // Use modulus to handle cases where d is greater than n
//         d = d % n;

//         // Create a new array to store the rotated elements temporarily
//         int[] rotatedArr = new int[n];

//         // Iterate through each element in the original array
//         for (int i = 0; i < n; i++) {
//             // Calculate the new index for the current element after rotation
//             int newIndex = (i + n - d) % n;

//             // Place the current element at its new rotated position
//             rotatedArr[newIndex] = arr[i];
//         }

//         // Copy the rotated array back to the original array
//         System.arraycopy(rotatedArr, 0, arr, 0, n);
//     }
// }
