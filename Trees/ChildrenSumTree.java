package Trees;

public class ChildrenSumTree {
    static class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
    }
    static boolean res =true;
    public boolean isSumProperty(Node root) {
        int ans =dfs(root);
        
        if(ans == -1) return false;
        
    return ChildrenSumTree.res;
        
    }
    private int dfs(Node node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return node.data;
        int left =dfs(node.left);
        int right=dfs(node.right);
        
        if(left+right != node.data) ChildrenSumTree.res = false; 
       
    return node.data; 
    }
    public static void main(String[] args) {
        ChildrenSumTree tree = new ChildrenSumTree();

    Node root = new Node(10);
    root.left = new Node(8);
    root.right = new Node(2);
    root.left.left = new Node(3);
    root.left.right = new Node(5);

    boolean result = tree.isSumProperty(root);
    System.out.println(result); 
    }

}
