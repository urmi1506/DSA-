
import java.util.Stack;

public class StockSpan {
        public static void main(String[] args) {
            int price[] = {100, 80, 60, 70, 60, 75, 85};
            int n = price.length;
            int[] span = calculateSpan(price, n);
    
            
            for (int s : span) {
                System.out.print(s + " ");
            }
        }
    
     public static int[] calculateSpan(int price[], int n) {
        // Your code here
        Stack<int[]> s = new Stack<>();
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            int currSpan = 1;
            while (!s.isEmpty() && s.peek()[0] <= price[i]) {
                currSpan += s.pop()[1];
            }
            s.push(new int[]{price[i], currSpan});
            span[i] = currSpan;
        }

        return span;
     }
}
