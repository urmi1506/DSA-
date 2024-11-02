package LinkedList;

public class LLLengthEven {
    static class Node{
        int data;
        Node next;
        Node(int x){
           data=x;
        }
    }
    public static boolean isLengthEven(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
          temp=temp.next;
          cnt++;
        }
        if(cnt%2==0)return true;
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(isLengthEven(head));
    }
}
