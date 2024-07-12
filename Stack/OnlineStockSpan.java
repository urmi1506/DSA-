package Stack;

import java.util.Stack;

public class OnlineStockSpan {

    Stack<int[]> s;
    int ind;

    public OnlineStockSpan() {
        s = new Stack<>();
        ind = 0;
    }

    public int next(int price) {
        int span = 1;

        while (!s.isEmpty() && s.peek()[0] <= price) {
            span += s.pop()[1];
        }

        s.push(new int[]{price, span});
        ind++;

        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = {100, 80, 70, 60, 75, 60, 85};
        for (int price : prices) {
            System.out.print(spanner.next(price) + " ");
        }
    }
}


