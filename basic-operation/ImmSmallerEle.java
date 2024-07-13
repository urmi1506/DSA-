public class ImmSmallerEle {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 2, 1, 5, 3};
        immediateSmaller( arr,n) ;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
    static void immediateSmaller(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
       
    }
}
