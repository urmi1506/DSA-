package LinkedList;

import java.util.ArrayList;

public class RevLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node reverseList(Node head) {
       //    Base Case
        if(head == null || head.next == null) return head;

        //1.store data
        ArrayList <Node> list =new ArrayList<>();
        Node temp =head;

        while(temp != null ){
            list.add(temp);
            temp=temp.next;
        }

        //2.reverse by swapping
        int s=0;
        int e =list.size()-1;

        while(s < e){
            int t1 = list.get(s).data;
            list.get(s).data=list.get(e).data;
            list.get(e).data =t1;

            s++;
            e--;

        }
    return head;
    }
    
    
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node  head =new Node(1);
        head.next = new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next= new Node(5);

        Node reverse= reverseList(head);

        printLinkedList(reverse);
    }

    
}
