package Trees;

import java.util.TreeMap;

public class MyCalendar {
    TreeMap<Integer, Integer> calcy;

    // Constructor for the MyCalendar class
    public MyCalendar() {
        calcy = new TreeMap<>();
    }

    // Method to book an event if there is no overlap
    public boolean book(int start, int end) {
        Integer prevBook = calcy.floorKey(start);  // Get the largest key <= start
        Integer nextBook = calcy.ceilingKey(start); // Get the smallest key >= start

        // Check for overlap with the previous and next events
        if ((prevBook == null || calcy.get(prevBook) <= start) && 
            (nextBook == null || end <= nextBook)) {
            calcy.put(start, end); // Add the event to the calendar
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();

        System.out.println(myCalendar.book(10, 20)); 
        System.out.println(myCalendar.book(15, 25)); 
        System.out.println(myCalendar.book(20, 30)); 
    }
}
