package easy.LC687;

public class LC687 {

    int ans = 0;

    public int longestUnivaluePath(TreeNode root) {
        arrowLength(root);
        return ans;
    }

    private int arrowLength(TreeNode root){
        if(root == null) {
            return 0;
        }
        int fromLeft = 0;
        int fromRight = 0;
        if(root.left != null){
            if(root.val == root.left.val){
                fromLeft = arrowLength(root.left) + 1;
            }else{
                arrowLength(root.left);
            }
        }
        if(root.right != null){
            if(root.val == root.right.val){
                fromRight = arrowLength(root.right) + 1;
            }else {
                arrowLength(root.right);
            }
        }
        ans = Math.max(ans, fromLeft + fromRight);
        return Math.max(fromLeft, fromRight);
    }

}
