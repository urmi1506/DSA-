package Array;

public class LeftRotate{
    public static void leftRotateByOne(int[]arr ,int n){

        // Dummy Arr to stored data
        int []temp =new int[n];
        temp[n-1] =arr[0];

        for (int i = 1; i < n; i++) {
             temp [i-1] =arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }
    public static void main(String[] args) {
        int n=5;
          int arr[]= {1,2,3,4,5};
          leftRotateByOne(arr,n);

    }
}