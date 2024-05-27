import java.util.ArrayList;

public class AddArr {
    
    // Reverses the given ArrayList
    public static ArrayList<Integer> reverse(ArrayList<Integer> v) {
        int s = 0;
        int e = v.size() - 1;

        while (s < e) {
            int temp = v.get(s);
            v.set(s, v.get(e));
            v.set(e, temp);
            s++;
            e--;
        }
        return v;
    }

    // Finds the sum of two arrays
    public static ArrayList<Integer> findArraySum(ArrayList<Integer> a, int n, ArrayList<Integer> b, int m) {
        int i = n - 1;
        int j = m - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int val1 = (i >= 0) ? a.get(i) : 0;
            int val2 = (j >= 0) ? b.get(j) : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }

        if (carry != 0) {
            ans.add(carry);
        }

        return reverse(ans);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(1);
        
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
        b.add(5);
        
        ArrayList<Integer> result = findArraySum(a, a.size(), b, b.size());
        System.out.println(result);
        
        ArrayList<Integer> reversedResult = reverse(result);
        System.out.println(reversedResult);
    }
}
