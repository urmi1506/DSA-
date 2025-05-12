package Hashing;

import java.util.ArrayList;
import java.util.List;

public class EvenNo {
     public static int[] findEvenNumbers(int[] digits) {
        int[] mpp = new int[10];
        for (int d : digits) mpp[d]++;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (mpp[i] == 0) continue;
            mpp[i]--;
            for (int j = 0; j <= 9; j++) {
                if (mpp[j] == 0) continue;
                mpp[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (mpp[k] == 0) continue;
                    res.add(i*100 + j*10 + k);
                }
                mpp[j]++;
            }
            mpp[i]++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        int[] ans =findEvenNumbers(digits);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
