
public class NextGreaterEle {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int nge[] = new int[m];

        for(int i=0; i<m; i++){
            int j=0;
            // find idx of nums[i] in nums2
            while(nums2[j] != nums1[i] ) j++;

            // find nge in nums2
            nge[i] = -1;
            for(int k =j+1; k<nums2.length; k++){
                if(nums2[k] >nums1[i]){
                    nge[i] = nums2[k];
                    break;
                }
            }

        }
    return nge;
    }
    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};
        int[] res=nextGreaterElement(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }

    // TC - O(n * m)
    // sc - O(n)
}
