package Array;

import java.util.HashSet;

public class Union {
    public static int[] arrayUnion(int[] nums1 ,int[] nums2){
        int n =nums1.length;
        int m =nums2.length;
        HashSet <Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums1[i]);
        }

        for(int i=0; i<m ; i++){
            set.add(nums2[i]);
        }

        int[] union = new int[set.size()];
        int i=0;

        for (int ans : set) {
            union[i++] = ans;
            
        }

    return union;

    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,4,5};
        int[] nums2 ={1,2,3,6};

        int[]res =Union.arrayUnion(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
        
    }

}
