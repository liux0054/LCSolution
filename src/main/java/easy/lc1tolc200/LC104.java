package easy.lc1tolc200;

import common.TreeNode;

public class LC104 {
    public int maxDepth(TreeNode root) {
       if(root == null){
            return 0;
       }
       return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
