package easy.lc801tolc1000;

import common.TreeNode;

public class LC965 {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return isUnivalTree(root.left) && isUnivalTree(root.right) && (root.left == null
            || root.val == root.left.val) && (root.right == null || root.val == root.right.val);
    }
}
