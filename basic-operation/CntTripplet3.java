public class CntTripplet3 {
    public static int countTriplets(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i <= n - 3; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    count++;
                    int temp = j + 1;
                    while (temp < k && arr[temp] == arr[temp - 1]) {
                        count++;
                        temp++;
                    }
                    k--;
                }
            }
        }
        return count;
    }
    
     public static void main(String[] args) {
        int arr[] = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr,target));
    }
}
