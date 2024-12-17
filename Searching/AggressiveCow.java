package Searching;

import java.util.Arrays;

public class AggressiveCow {
     public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int low = 1; 
        int high = stalls[stalls.length - 1] - stalls[0]; 
        int res = 0;

        while (low <= high) {
            int mid = (low + high) / 2; 
            
            if (canPlaceCows(stalls, k, mid)) {
                res = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return res; 
    }

    private static boolean canPlaceCows(int[] stalls, int cows, int dist) {
        int cnt = 1; 
        int lastPos = stalls[0]; 

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) { 
                cnt++; 
                lastPos = stalls[i]; 
                
                if (cnt == cows) {
                    return true;
                }
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int stalls[] = {1, 2, 4, 8, 9}, k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }
}
