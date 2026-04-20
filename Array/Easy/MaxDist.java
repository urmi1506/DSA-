package Easy;

public class MaxDist{
    public static int maxDistance(int []colors){
        int n = colors.length;
        int max_dist =0;

        for(int i=0; i<n; i++){
            for(int j = n-1 ; j>1; j--){
                if(colors[i] != colors[j]){
                   int curr_dist =Math.abs(i-j);
                   max_dist=Math.max(max_dist ,curr_dist);
                }
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