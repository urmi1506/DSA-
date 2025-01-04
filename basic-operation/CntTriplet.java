

public class CntTriplet {
    public static int countTriplets(int[] arr, int target) {
        int cnt=0;
         for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (i< j && j< k && arr[i] + arr[j] + arr[k] == target ) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    } 
    public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr,target));
    }
}
