package Medium;

public class Duplicate {
    public static int findDuplicate(int[] nums) {
        int slow =nums[0];
        int fast =nums[0];
        // iterate slow and fast upto find cycle
        do{
            slow =nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        // if cycle found reintialized fast or slow run upto both pt meet
        fast=nums[0];
        while(slow != fast){
            slow=nums[slow];
            fast=nums[fast];
        }
    return (slow <1?-1:slow);   
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        int res =findDuplicate(nums);
        System.out.println(res);
    }
}
