public class SplitArr {
    public static boolean canSplit(int arr[]) {
        // store the sum of all elements in array.
        int totalSum = 0;
        // Calculate Total Sum
        for(int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        // Check for Possible Split
        int currSum = 0;
        for(int i = 0; i < arr.length; i++) {
            // sum of elements from index i+1 to end of array.
            totalSum -= arr[i];
            // sum of elements from start of the array to current index i.
            currSum += arr[i];
            
            if(totalSum == currSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 5};
        System.out.println(canSplit(arr));


    }
}
