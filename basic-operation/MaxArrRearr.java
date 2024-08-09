import java.util.Arrays;

public class MaxArrRearr {
     public static int Maximize(int[] arr) {
      
        Arrays.sort(arr);
        
        long total = 0;
        for (int ind = 0; ind < arr.length; ind++) {
            total += ind * (long) arr[ind];
        }
        
        return (int) (total % ((int)(Math.pow(10, 9)) + 7));
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};
        System.out.println(Maximize(arr));
    }
}
