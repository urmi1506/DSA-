package Trees;

public class GoodNodes {
    public static int goodNodes(TreeNode root) {
       return dfs(root ,Integer.MIN_VALUE);
    }
    private static int dfs(TreeNode currNode , int maxNode){
        // Edge case
        if(currNode == null)
           return 0;
        // cal good Nodes
        int cnt=0;
        if(currNode.val >= maxNode)
           cnt++;

        //update maxNode
        maxNode = Math.max(currNode.val ,maxNode);

        // Traverse left & right check goodnode
        int leftGoods = dfs(currNode.left ,maxNode);
        int rightGoods = dfs(currNode.right ,maxNode);

    // return all good nodes cnt
    return cnt + leftGoods + rightGoods;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        int goodNodesCount = goodNodes(root);
        System.out.println(goodNodesCount); 
    }
}
