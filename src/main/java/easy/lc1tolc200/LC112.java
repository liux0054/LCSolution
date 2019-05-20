package easy.lc1tolc200;

import common.TreeNode;

public class LC112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            if(sum == root.val){
                return true;
            }else{
                return false;
            }
        }else{
            boolean fromLeft = false;
            boolean fromRight = false;
            if(root.left != null) {
                fromLeft = hasPathSum(root.left, sum - root.val);
            }
            if(root.right != null) {
                fromRight = hasPathSum(root.right, sum - root.val);
            }
            return fromLeft || fromRight;
        }
    }
}
