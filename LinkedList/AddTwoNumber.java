package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry =0 ;
        int totalSum = 0;

        while(l1 != null || l2 != null || carry != 0){
            totalSum = carry;

            if(l1 != null){
                totalSum += l1.val;
                l1 = l1.next;
            }

             if(l2 != null){
                totalSum += l2.val;
                l2 = l2.next;
            }

            // extract digit
            int digit = totalSum % 10;
            // update carry
            carry = totalSum /10;
            // create node with extracted digit
            dummy.next = new ListNode(digit);
            dummy = dummy.next;

        }
    return ans.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);  
    }


}
 
