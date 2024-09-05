public class MissingRoll {
        public static int[] missingRolls(int[] rolls, int mean, int n) {
            int m = rolls.length;
            int totalSum = mean * (n + m);
            int observedSum = 0;
            
            for (int roll : rolls) {
                observedSum += roll;
            }
            
            int missingSum = totalSum - observedSum;
            
            if (missingSum < n || missingSum > 6 * n) {
                return new int[0];
            }
            
            int base = missingSum / n;
            int remainder = missingSum % n;
            
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = base + (i < remainder ? 1 : 0);
            }
            
            return result;
        }
    public static void main(String[] args) {
        int[] rolls = {3,2,4,3};
        int mean = 4, n = 2;
        int[] ans=missingRolls(rolls, mean, n);
        for (int res : ans) {
            System.out.println(res);
        }
        
    }
}
