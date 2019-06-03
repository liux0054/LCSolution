package medium;

import common.TreeNode;

public class LC701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         insert(root, val);
         return root;
    }

    private void insert(TreeNode root, int val){
        if(root == null){
            return;
        }
        if(root.val > val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return;
            }else{
                insertIntoBST(root.left, val);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                insertIntoBST(root.right, val);
            }
        }

    }
}
