package LinkedList;

public class LLPalindrome {
    
        static Node root;
        static boolean isPalindrome(Node head) {
            root=head;
            return find(head);
        }
        static boolean find(Node head){
            if(head==null)return true;
            boolean ans=find(head.next);
            if(head.data!=root.data)return false;
            root=root.next;
            return ans;
        }
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(1);
            head.next.next.next = new Node(1);
            head.next.next.next.next = new Node(2);
            head.next.next.next.next.next = new Node(1);
            System.out.println(isPalindrome(head));

        }
 }

