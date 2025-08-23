package Easy;

public class ReveseArray {
    public static void revese(int nums[]){
        int n=nums.length;
        for (int i = 0; i < n/2; i++) {
            int temp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        revese(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
