package medium.lc1001tolc1200;

import java.util.Arrays;

import common.TreeNode;

public class LC1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode(preorder[0]);
        int i = 1;
        while(i<preorder.length && preorder[i]<preorder[0]){
            i++;
        }
        root.left = bstFromPreorder(Arrays.copyOfRange(preorder, 1, i));
        root.right = bstFromPreorder(Arrays.copyOfRange(preorder, i, preorder.length));
        return root;
    }
}
