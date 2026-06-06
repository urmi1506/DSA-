package LinkedList;

class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            data=this.data;
            next=null;
        }
    }
public class DuplicateNo {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
           slow =nums[slow];
           fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while(slow!= fast){
            slow = nums[slow];
            fast =nums[fast];
        }
    return slow<1 ? -1 :slow;

    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        int Duplicate = findDuplicate(nums);
        System.out.println(Duplicate);
    }
}
