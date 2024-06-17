package Recursion;

public class RevArr { 
    // two pointer approach
    static int[] arr; 

    public static void main(String[] args) {
        int n=5;
        arr = new int[] {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        printArray(arr);

        solve(0, n - 1);

        System.out.println("Reversed array:");
        printArray(arr);
    }

    static void solve(int l, int r) {
        // Base case
        if (l >= r)
            return;

        // Swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // Recursive call
        solve(l + 1, r - 1);
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
