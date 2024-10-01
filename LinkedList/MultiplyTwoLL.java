package LinkedList;
public class MultiplyTwoLL {
    static class Node{
        int data;
        Node next;
        Node (int key){
            data=key;
        } 
    }
    public static long multiplyTwoLinkedList(Node first,Node second){
        long data1=0 , data2=0;
        while(first!=null){
            data1=data1*10+first.data;
            first=first.next;
        }
        while(second!=null){
            data2=data2*10+second.data;
            second=second.next;
        }
        return data1*data2%1000000007;
    }
    public static Node createLinkedList(int[] digits) {
        Node head = null, temp = null;
        for (int digit : digits) {
            if (head == null) {
                head = new Node(digit);
                temp = head;
            } else {
                temp.next = new Node(digit);
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        int[] num1 = {1, 2, 3}; 
        int[] num2 = {4, 5, 6};

        Node first = createLinkedList(num1);
        Node second = createLinkedList(num2);

        long result = multiplyTwoLinkedList(first, second);
        System.out.println("The product is: " + result);
    }
}

