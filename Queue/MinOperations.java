package Queue;
import java.util.PriorityQueue;

public class MinOperations {
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (num < k) pq.add(num);
        }

        int operations = 0;

        while (!pq.isEmpty()) {
            int x = pq.poll();
            operations++;

            if (pq.isEmpty()) break;

            int y = pq.poll();
            long newValue = 2L * x + y;

            if (newValue < k) pq.add((int) newValue);
        }

        return operations;
    }
    public static void main(String[] args) {
        int []nums = {2,11,10,1,3};
        int  k = 10 ;
        System.out.println(minOperations(nums, k) );
    }
}
