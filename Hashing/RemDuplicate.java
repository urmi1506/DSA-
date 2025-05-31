package Hashing;

import java.util.HashSet;

// Remove Duplicate from sorted as well as unsorted arr
public class RemDuplicate {
    public static HashSet<Integer> removeDuplicates(int [] arr){
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
     return set;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,6,5};
        System.out.println(removeDuplicates(arr));
    }
}
