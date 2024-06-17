package Recursion;
public class SummationOfNo {
    //by parameterized way
    public static void main(String[] args) {
        int n = 3;
        print(n, 0);
    }

    static void print(int i, int sum) {
        // base case
        if (i < 1) { 
            System.out.println(sum);
            return;
        }
        print(i - 1, sum + i); 
    }
}

