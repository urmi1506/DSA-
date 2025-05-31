package Array;
// Remove Duplicate Element From Sorted Array
public class RemDuplicates {
    // in this logic we skip duplicate and add unique ele
    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        // track unique ele
        int j=0;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i]; //move unique ele to nxt pos
            }
        }
    return j+1; // give total unique ele
    }
    public static void main(String[] args) {
        int[] arr={3,3,5,6};
        int newLen=removeDuplicates(arr);
        System.out.println();
        // if loop upto old arr length it provide last val as duplicate
        for (int i = 0; i < newLen; i++) {
            System.out.println(arr[i]);
        }
    }
}
