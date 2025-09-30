
import java.util.Stack;

public class DeleteMidEle {
    public static void main(String[] args) {
        int ARR [ ] = {5, 6, 7, 8 } , N = 4;
        Stack<Integer> inputStack=new Stack<>();

        for (int i = 0; i < N; i++) {
            inputStack.push(ARR[i]);
        }
        deleteMiddle(inputStack, N);
        
         while (!inputStack.isEmpty()) {
            System.out.println(inputStack.pop());
        }

    }
    public static void solve(Stack<Integer> inputStack, int k) {
		if(k==1){
            inputStack.pop();
            return;
        }
        int temp=inputStack.peek();
        inputStack.pop();
        solve(inputStack, k-1);
        inputStack.push(temp);
	}

    public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		if(inputStack.size()==0){
            return;
        }
        int k = (N % 2 == 0) ? N / 2 : (N / 2) + 1;
        solve(inputStack, k);
	}
}
