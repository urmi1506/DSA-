public class SightSeeing{
    public static int maxScoreSightseeingPair(int[] values) {
        int n = values[0];
        int res = Integer.MIN_VALUE;

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + n > res) res = values[i] - i + n;
            
            if (values[i] + i > n) n = values[i] + i;
        }
        return res;
    }
    public static void main(String[] args) {
       int[] values = {8,1,5,2,6};
       System.out.println(maxScoreSightseeingPair(values));
    }

}