package Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class NearGrtstEle {
   
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        ArrayList<Long> list = new ArrayList<>();
        Stack<Long> s = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            // While stack is not empty and stack top is less than or equal to arr[i]
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            // If stack is empty, add -1 to the list
            if (s.isEmpty()) {
                list.add(-1L);
            } else {
                // Else add the stack top to the list
                list.add(s.peek());
            }
            // Push the current element to the stack
            s.push(arr[i]);
        }
        
        // Reverse the list to maintain the correct order
        Collections.reverse(list);
        
        // Convert the list to an array
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


