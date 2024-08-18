package Heap;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UgliNo {
     public static int nthUglyNumber(int n) {
         // used to generate ugly no
        int[] primeFact = {2, 3, 5};  
        // store ugly no
        PriorityQueue<Long> minHeap = new PriorityQueue<>();  
         // track of already seen ugly no
        HashSet<Long> seenUglyNo = new HashSet<>();  
        
         // first ugly no
        minHeap.add(1L); 
        seenUglyNo.add(1L);  
        
        long currUgly = 1L;  
        for (int i = 0; i < n; i++) {
            // Extract smallest ugly no from heap
            currUgly = minHeap.poll();  
            for (int prime : primeFact) {
                long nextUgly = currUgly * prime;  
                if (!seenUglyNo.contains(nextUgly)) { 
                // Add the new ugly no to heap
                    minHeap.add(nextUgly);  
                    seenUglyNo.add(nextUgly);  
                }
            }
        }
        // nth ugly no
        return (int)currUgly;  
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println( nthUglyNumber( n) );

    }
}
