package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianEle {
    // Two heap -->left side -->max heap & right side -->minHeap
    static PriorityQueue<Integer>left;
    static PriorityQueue<Integer>right;
    public static void MedianFinder() {
        // max Heap -->left as get max ele from left
        left = new PriorityQueue<>(Collections.reverseOrder());
        // min Heap -->right side as get min ele from right
        right = new PriorityQueue<>();
    }
    
    public static void addNum(int num) {
        // add elements in half
        if(left.isEmpty() || num <= left.peek()){
            left.offer(num);
        }else{
            right.offer(num);
        }
        // Balance both heap --> as need sorted
        // 1.left size must be only 1 ele > than right -->as in odd cond middle ele is median
        if(left.size() > right.size()+1){
            // left size hv more than 1 ele extra -->remove from left & add to right
            right.offer(left.poll());

        }
        // 2.right size > left size
        else if(right.size() > left.size()){
        //    remove ele from right & add to left
            left.offer(right.poll());
        }
    }
    
    public static double findMedian() {
        // odd
        if(left.size() > right.size()){
            return left.peek();
        }
        // even
        return (left.peek() + right.peek()) /2.0;
    }
    public static void main(String[] args) {
        MedianFinder();
        addNum(1);
        addNum(2);
        System.out.println(findMedian()); 
        addNum(3);
        System.out.println(findMedian()); 
    }
}

