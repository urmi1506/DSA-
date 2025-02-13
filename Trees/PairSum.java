package Trees;

public class PairSum {
    static class Node {
        int data;
        Node left, right;
    
        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    
        static boolean findTarget(Node root, int target) {
            // Write your code here
            return helper(root, root, target);
        }
        
        static boolean helper(Node root, Node current, int target){
            if(root == null || current == null){
                return false;
            }
            if(findNode(root,current,target-current.data)){
                return true;
            }
            return helper(root, current.left, target) 
            || helper(root, current.right, target);
        }
        
        static boolean findNode(Node root, Node current, int target){
            if(root == null || root == current){
                return false;
            }
            if(root.data == target){
                return true;
            }
            else if(root.data > target){
                return findNode(root.left, current, target);
            } 
            else {
                return findNode(root.right,current, target);
            }
        }
        public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right=new Node(9);
        int target=12;
        System.out.println(findTarget(root, target));

        }
    }
     
    
    

