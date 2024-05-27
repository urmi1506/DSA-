import java.util.Vector;

public class LargestEleArray {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(8);
        arr.add(7);
        arr.add(56);
        arr.add(90);

        LargestEleArray largestEleArr = new LargestEleArray();
        int result = largestEleArr.largest(arr, n);
        System.out.println("Largest element: " + result);
    }

    public int largest(Vector<Integer> arr, int n) {
        int max = arr.get(0);
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max)
                max = arr.get(i);
        }
        return max;
    }
}
