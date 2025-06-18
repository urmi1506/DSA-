package Easy;

public class LeftRotateArr {
   public static void leftRotateByOne(int[] arr,int n){
    int x= arr[0];
    for (int i = 0; i < n-1; i++) {
        arr[i] = arr[i+1];
    }
    arr[n-1] =x;
    for (int i = 0; i < n ;i++) {
        System.out.println(arr[i]);
    }
   } 
   public static void main(String[] args) {
        int n=5;
          int arr[]= {1,2,3,4,5};
          leftRotateByOne(arr,n);

    }
}
