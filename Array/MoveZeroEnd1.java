package Array;

public class MoveZeroEnd1{
    public static void moveZeroes(int[] arr){
        int n= arr.length;
        // temp arr to store ele
        int temp[] = new int[n];

        // track temp ele
        int j=0;

        // fill temp arr with non-zero ele
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp[j++] =arr[i];
            }
        }

        // fill non zero element at remaining pos
        while(j < n) {
            temp[j++] = 0;
            
        }
        // copy ele of temp arr to original arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
       
    }
}