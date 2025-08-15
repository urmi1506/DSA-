package Medium;
import java.util.Vector;
import java.util.Arrays;
// GM
public class MergeVector {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(Arrays.asList(1, 3, 5));
        Vector<Integer> v2 = new Vector<>(Arrays.asList(2, 4, 6));

        Vector<Integer> merged = new Vector<>();
        int i = 0, j = 0;

        while (i < v1.size() && j < v2.size()) {
            if (v1.get(i) <= v2.get(j)) {
                merged.add(v1.get(i++));
            } else {
                merged.add(v2.get(j++));
            }
        }

        while (i < v1.size()) merged.add(v1.get(i++));
        while (j < v2.size()) merged.add(v2.get(j++));

        System.out.println("Merged Sorted Vector: " + merged);
    }
}
