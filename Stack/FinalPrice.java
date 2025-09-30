
import java.util.Stack;

public class FinalPrice {
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n]; 
        Stack<Integer> s = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            ans[i] = prices[i];
        }

        for (int i = 0; i < n; i++) {
            
            while (!s.isEmpty() && prices[s.peek()] >= prices[i]) {
                int ind = s.pop(); 
                ans[ind] = prices[ind] - prices[i]; 
            }
            s.push(i); 
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] res = finalPrices(prices);
        for (int price : res) {
            System.out.print(price + " ");
        }
    }
}
