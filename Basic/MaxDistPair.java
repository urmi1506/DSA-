package Basic;

public class MaxDistPair{

    public static int maxDistance(int[] nums1, int[] nums2) {
        int max_dist = Integer.MIN_VALUE;
        int curr_dist =0;
        
        for(int i=0; i<nums1.length; i++){
            for(int j =0 ; j<nums2.length; j++){
                if(nums1[i] <= nums2[j] && i <= j){
                    curr_dist = j - i;
                }
                if(curr_dist > max_dist) {
                    max_dist = curr_dist;
                }
            }
        }
    return max_dist == Integer.MIN_VALUE ? 0 : max_dist;
    }
    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};

        int max_dist = maxDistance(nums1, nums2);
        System.out.println(max_dist);
    }

}