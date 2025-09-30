
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NrstGrstEleCirArr {

    // Function to find the next greater element for each element of the array in a circular manner.
    public static long[] nextLargerElement(long[] arr, int n) {
        ArrayList<Long> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        // Traverse the array twice for the circular effect
        for (int i = 2 * n - 1; i >= 0; i--) {
            int ca = i % n; // Circular index
            
            // While stack is not empty and the top of the stack is less than or equal to arr[ca]
            while (!s.isEmpty() && arr[s.peek()] <= arr[ca]) {
                s.pop();
            }
            
            // for circular arr have two pass
            if (i < n) {
                if (s.isEmpty()) {
                    list.add(-1L);
                } else {
                    list.add(arr[s.peek()]);
                }
            }
            
            // Push the current index onto the stack
            s.push(ca);
        }
        
        // Reverse the list to maintain the correct order
        Collections.reverse(list);
        
        // Convert the ArrayList to a long array
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        long[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        long[] result = nextLargerElement(arr, n);
        
        // Print the result
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
