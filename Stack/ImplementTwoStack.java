

public class ImplementTwoStack {
    int[] arr;
    int top1, top2, size=5000;

    ImplementTwoStack() {
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }

    // Function to push an integer into stack1.
    void push1(int x) {
        if (top2 - top1 > 1) {
            top1++;
            arr[top1] = x;
        } 
    }

    // Function to push an integer into stack2.
    void push2(int x) {
        if (top2 - top1 > 1) {
            top2--;
            arr[top2] = x;
        }
    }

    // Function to remove an element from top of stack1.
    int pop1() {
        if (top1 >= 0) {
            int ans = arr[top1];
            top1--;
            return ans;
        } else {
            return -1;
        }
    }

    // Function to remove an element from top of stack2.
    int pop2() {
        if (top2 < size) {
            int ans = arr[top2];
            top2++;
            return ans;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        ImplementTwoStack s = new ImplementTwoStack();

        s.push1(2);
        s.push1(3);
        s.push1(4);
        System.out.print(s.pop1() + " ");
        System.out.print(s.pop1() + " ");

        System.out.print(s.pop2() + " ");

        }
}

