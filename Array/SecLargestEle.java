package Array;
public class SecLargestEle {
    public static int SecLargestElement(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxi = i;
            for (int j = i+1; j < n-1; j++) {
                if (arr[j] > arr[j+1]) maxi =j;
            }

            int temp = arr[i];
            arr[i] = arr[maxi];
            arr[maxi] = temp;
            
        }
    return arr[n-1];
    }
    public static void main(String[] args) {
        int [] arr={3,3,6,5};
        System.out.println(SecLargestElement(arr));
        
    }
}
