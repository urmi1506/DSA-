package LinkedList;
// For kth position
public class DeleteKthEle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deleteKthNode(Node head ,int k){
        // Edge case
        if(head == null) return head;
        
        // k=1 ....delete head
        if(k == 1){
            Node temp =head;
            head = temp.next;

        return head;
        }

        int cnt =0;
        Node temp = head;
        Node prev = null ;

        while(temp != null){
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }

    return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(5);

        int k = 4;

        
        Node res = deleteKthNode(head ,k);
        while (res != null) {
            System.out.print(res.data +" ");
            res = res.next;
        }
    }
}
