import java.util.PriorityQueue;

public class k_largest {
     public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (minHeap.size() < k) {
                    minHeap.offer(sum);
                } else if (sum > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.offer(sum);
                }
            }
        }

        return minHeap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        int k = 2 ;
        System.out.println(kthLargest(arr, k));
    }
}
