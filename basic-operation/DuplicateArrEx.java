import java.util.ArrayList;

public class DuplicateArrEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        int n = arr.size();
        ArrayList<Integer> res = duplicates(arr, n); 
        System.out.println(res);
    }

    public static ArrayList<Integer> duplicates(ArrayList<Integer> arr, int n) {
        // Create an ArrayList to store the elements of the array
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate through the array and add each element to the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(arr.get(i));  
        }

        // Reset all elements of the array to 0 for counting each element
        int[] count = new int[n];

        // Count the occurrences of each element using the array
        for (int i = 0; i < n; i++) {
            count[list.get(i)] += 1; 
        }

        // Clear the ArrayList to prepare for storing the duplicate elements
        list.clear();

        // Iterate through the array and add indices of elements with count > 1 to the ArrayList
        for (int i = 0; i < n; i++) {
            if (count[i] > 1) 
                list.add(i);
        }

        // If no duplicates are found, add -1 to the ArrayList
        if (list.size() == 0) 
            list.add(-1);
        
        // Return the ArrayList containing duplicate elements or -1 if no duplicates found
        return list;
    }
}
