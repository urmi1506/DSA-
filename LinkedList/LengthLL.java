package LinkedList;

public class LengthLL {
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int getCount(Node head) {
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
    return cnt;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        int res = getCount(head);
        System.out.println(res);
    }
}
