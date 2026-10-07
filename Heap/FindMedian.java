package Heap;
import java.util.List;
import java.util.*;

public class FindMedian {
    // list -->dynamic size --->as no of elements unknown
    static List<Integer>list;
    public static void MedianFinder() {
        list = new ArrayList<>();
    }
    
    public static void addNum(int num) {
        // add num in list
        list.add(num);
    }
    
    public static double findMedian() {
        // Sorted elemets -->as we find median from data stream
        Collections.sort(list);
        int n = list.size();
        // odd
        if(n%2 != 0){
            return list.get(n/2);
        }
        // even
        return (list.get(n/2-1) + list.get(n/2))/2.0;
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
