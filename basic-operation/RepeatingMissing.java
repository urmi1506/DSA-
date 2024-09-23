public class RepeatingMissing {
    static void repeatMissNo(int arr[], int n) {
        int RepeatingNo = -1;
        int MissingNo = -1;

        // Loop to check each number from 1 to n
        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            // Inner loop to count occurrences of each number
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }

            // If the count is 2, it's the repeating number
            if (cnt == 2) {
                RepeatingNo = i;
            }

            // If the count is 0, it's the missing number
            if (cnt == 0) {
                MissingNo = i;
            }

            // If both numbers are found, we can break out of the loop
            if (RepeatingNo != -1 && MissingNo != -1) {
                break;
            }
        }

        // Output the results
        System.out.println("Repeating Number: " + RepeatingNo);
        System.out.println("Missing Number: " + MissingNo);
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 5};
        int n = arr.length;
        repeatMissNo(arr, n);
    }
}
