import java.util.HashSet;

public class UnionArray {
    public static int findUnion(int a[], int b[]) {
        // for holding distinct val
        HashSet <Integer> h1=new HashSet<>();
        for (int val : a) {
            h1.add(val);
        }
        for (int val : b) {
            h1.add(val);
        }
    return h1.size();
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3};
        System.out.println(findUnion(a, b));
    }
}
