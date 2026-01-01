package Trees;
public class SymmetryBT {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left ,root.right);
    }
    private static boolean isMirror(TreeNode a ,TreeNode b){
    // both node null
       if(a == null && b == null) return true;
       //one node null
       if(a == null || b == null) return false;
       //check node are mirror or not
       return a.val == b.val && isMirror(a.right ,b.left) && isMirror(a.left ,b.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));
    }
}
