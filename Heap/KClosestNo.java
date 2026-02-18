package Heap;
import java.util.PriorityQueue;

public class KClosestNo {
    public static void kClosestno(int[] nums , int k , int x){
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int num : nums) {
            maxHeap.add(new int[]{Math.abs(num - x), num});
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll()[1] + " ");
            
        }
    }
    public static void main(String[] args) {
        int [] nums = {5,6,7,8,9};
        int k = 3;
        int x = 7;
        kClosestno(nums,k,x);
    

    }
}
