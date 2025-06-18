package Easy;

import java.util.ArrayList;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> list =new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,4,5};
        int[] nums2 ={1,2,3,6};

        int[]res =intersection(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
