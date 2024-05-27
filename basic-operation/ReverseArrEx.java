import java.util.ArrayList;

public class ReverseArrEx {
    public static void  reverseArray(ArrayList<Integer> arr, int m) {
        int start = m+1;
        int end = arr.size() - 1;
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(16);
        arr.add(19);
        arr.add(72);
        arr.add(23);
        int m=2;
         reverseArray(arr,m) ;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println( arr.get(i) );
        }
    }
}
