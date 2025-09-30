
import java.util.ArrayList;
import java.util.Stack;
// import javafx.util.Pair;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[] = {100, 80, 70, 60, 75, 60, 85};
        // Call the stockSpan method and print the result
        int[] span = stockSpan(arr);
        for (int value : span) {
            System.out.print(value + " ");
        }
    }

    public static int[] stockSpan(int[] arr) {
        // create stack
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        // use to know index
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek().getKey() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                list.add(-1);
            } else {
                list.add(s.peek().getValue());
            }
            s.push(new Pair<>(arr[i], i));
        }
        
        int[] span = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            span[i] = i - list.get(i);
        }
        
        return span;
    }
}
