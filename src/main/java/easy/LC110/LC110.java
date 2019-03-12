package easy.LC110;

public class LC110 {

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        return Math.abs(depth(root.left)-depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root){
        if(root == null) {
            return 0;
        }
        else {
            return Math.max(depth(root.left), depth(root.right)) + 1;
        }
    }
}
