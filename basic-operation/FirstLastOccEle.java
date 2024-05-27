public class FirstLastOccEle {
    public static void main(String[] args) {
        int N = 7;
        int K = 3;
        int arr[] = { 1, 2, 3, 4, 3, 3, 3 };
        System.out.println(firstOccurrence(arr, N, K));
        System.out.println(lastOccurrence(arr, N, K));
    }

    static int firstOccurrence(int arr[], int N, int K) {
        int low = 0;
        int high = N - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == K) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int arr[], int N, int K) {
        int low = 0;
        int high = N - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == K) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return ans;
    }
}
