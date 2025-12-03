package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ComboSum3 {
    public static void main(String[] args) {
        int k=4 ;
        int n=7 ;
        System.out.println( combinationSum3( k,  n));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = solve(k, n, 1, new ArrayList<>());
        if (n < k) {
            return res;
        }
        return res;
    }
    private static List<List<Integer>> solve(int k, int n, int i, List<Integer> in) {
        if (n == 0 && k == 0) {
            List<List<Integer>> out = new ArrayList<>();
            out.add(new ArrayList<>(in));
            return out;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int j = i; j <= 9; j++) {
            if (n - j < 0 || k - 1 < 0) {
                break;
            }
            in.add(j);
            res.addAll(solve(k - 1, n - j, j + 1, in));
            in.remove(in.size() - 1);
        }
        return res;
    }
}

