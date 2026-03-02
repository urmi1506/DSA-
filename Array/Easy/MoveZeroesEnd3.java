package Easy;

public class MoveZeroesEnd3 {
    public static void moveZeroes(int[] arr){
        int n= arr.length;
    

        // track temp ele
        int j=0;

        // fill temp arr with non-zero ele
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[j++] =arr[i];
            }
        }

        // zero element at remaining pos
        while(j < n) {
            arr[j++] = 0;
            
        }
        

    }
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
       
    }

}
