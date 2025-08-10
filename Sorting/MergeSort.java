package Sorting;

public class MergeSort {
    public static void mergeSort(int []nums,int low,int high ){
        int mid=low+(high-low)/2;

        // base case
        if(low >= high) return;
        mergeSort(nums,low,mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid,high);

    }
    private static void merge(int []nums,int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
                
            }
            else{
                temp[k++]=nums[right++];

            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++]=nums[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[low+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int n=nums.length;
        mergeSort(nums, 0, n - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
