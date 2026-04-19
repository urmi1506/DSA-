package Basic;

public class MaxDist {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int max_dist = 0;
        int i =0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                max_dist = Math.max(max_dist , j - i);
                j++;
            }
            else{
                i++;
            }
        }
        
    return max_dist ;
    }
    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};

        int max_dist = maxDistance(nums1, nums2);
        System.out.println(max_dist);
    }
}
