
import java.util.Stack;

public class SortStack {
     public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        // Pop top element
        int top = st.pop();

        // Recursively sort rest
        sortStack(st);

        //Insert element back in correct position
        insertInSortedOrder(st, top);
    }
    private static void insertInSortedOrder(Stack<Integer> st, int ele) {
        if (st.isEmpty() || st.peek() >= ele) {
            st.push(ele);
            return;
        }

        int top = st.pop();
        insertInSortedOrder(st, ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);
        sortStack(st);
        for (Integer i : st) {
            System.out.println(i);
        }
    }
}
