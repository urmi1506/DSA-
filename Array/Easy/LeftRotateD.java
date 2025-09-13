package Easy;

public class LeftRotateD {

    public static void LeftRotateByK(int[] arr, int n, int k) {
        k = k % n;  

        // Store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to  left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy temp elements to end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        LeftRotateByK(arr, n, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
