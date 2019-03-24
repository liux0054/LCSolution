package easy;

import common.TreeNode;

public class LC538 {
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.right != null){
            convertBST(root.right);
            root.val += root.right.val;
        }

        if(root.left != null){
            root.left.val += root.val;
            convertBST(root.left);
        }

        return root;
    }
}
