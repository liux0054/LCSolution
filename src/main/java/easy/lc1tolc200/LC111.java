package easy.lc1tolc200;

import common.TreeNode;

public class LC111 {

    public int minDepth(TreeNode root) {
       if(root == null) {
           return 0;
       }
       if (root.left == null && root.right == null) {
           return 1;
       }
       int currentMinDepth = Integer.MAX_VALUE;
       if(root.left != null){
           currentMinDepth = Math.min(currentMinDepth, minDepth(root.left) + 1);
       }
       if(root.right != null){
           currentMinDepth = Math.min(currentMinDepth, minDepth(root.right) + 1);
       }
       return currentMinDepth;
    }
}
