package SlidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SubArrMax {
    // Function to find maximum of each subarray of size k.
    public static ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
       ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>(); 

        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if (i >= k - 1) {
                res.add(arr[deque.peek()]);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println(max_of_subarrays(k, arr));
    }
}

