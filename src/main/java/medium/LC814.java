package medium;

import common.TreeNode;

public class LC814 {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            if(root.val == 0){
                return null;
            }else{
                return root;
            }
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }else{
            return root;
        }
    }
}
