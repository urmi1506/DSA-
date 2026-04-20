package Easy;

public class MaximumDist {
    public static int maxDistance(int[] colors){
        int max_dist = 0;
        int n = colors.length;

        for (int i = 0; i < n; i++) {
            // compare all ele with 1st ele
            if(colors[i] != colors[0]){
                max_dist = Math.max(max_dist, i);
            }
            // compare all ele with last ele
            if(colors[i] != colors[n-1]){
                max_dist = Math.max(max_dist, n-i-1);
            }
        }
    return max_dist;
    }
    public static void main(String[] args) {
        int colors[] = {1,8,3,8,3};
        int max_dist = maxDistance(colors);
        System.out.println(max_dist);
    }
}
