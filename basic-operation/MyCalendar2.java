import java.util.ArrayList;
import java.util.List;

public class MyCalendar2 {
   
    // List to hold the booked intervals
    private List<int[]> bookings;

    public MyCalendar2() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        // Check for overlaps with existing bookings
        for (int[] interval : bookings) {
            int a = interval[0], b = interval[1];

            // Check if the new booking overlaps with the existing interval
            if (start < b && end > a) {
                // Calculate the overlapping sub-interval
                int newStart = Math.max(a, start);
                int newEnd = Math.min(b, end);

                // Check if the sub-interval overlaps more than once
                if (check(newStart, newEnd)) {
                    return false;  // Overlapping more than once, booking fails
                }
            }
        }

        // If there are no conflicts, add the booking
        bookings.add(new int[] {start, end});
        return true;  // Booking successful
    }

    // Check if the sub-interval overlaps more than once
    private boolean check(int start, int end) {
        int overlapCount = 0;

        for (int[] interval : bookings) {
            int a = interval[0], b = interval[1];

            // Check for strict overlap
            if (start < b && end > a) {
                overlapCount++;
                if (overlapCount == 2) {
                    return true;  // Found more than one overlap
                }
            }
        }

        return false;  
    }

    public static void main(String[] args) {
        MyCalendar2 calendar = new MyCalendar2();

        System.out.println(calendar.book(10, 20));  
        System.out.println(calendar.book(50, 60));  
        System.out.println(calendar.book(10, 40));  
        System.out.println(calendar.book(5, 15));   
        System.out.println(calendar.book(5, 10));   
        System.out.println(calendar.book(25, 55));  
    }
}
