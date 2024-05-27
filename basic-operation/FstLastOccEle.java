import java.util.ArrayList;
import java.util.List;

public class FstLastOccEle {

    static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int firstIndex = first(arr, k, n);
        int lastIndex = last(arr, k, n);
        return new int[]{firstIndex, lastIndex};
    }

    static int first(ArrayList<Integer> arr, int x, int n) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x)
                high = mid - 1;
            else if (arr.get(mid) < x)
                low = mid + 1;
            else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    static int last(ArrayList<Integer> arr, int x, int n) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x)
                high = mid - 1;
            else if (arr.get(mid) < x)
                low = mid + 1;
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 2, 2, 2, 3, 4, 7, 8, 8));
        int n = arr.size();
        int k = 2; // specify the element to find
        int[] result = firstAndLastPosition(arr, n, k);

        System.out.println("First Occurrence = " + result[0]);
        System.out.println("Last Occurrence = " + result[1]);
    }
}
