package medium;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class LC230 {
    List<Integer> values = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        getTreeValues(root);
        return values.get(k-1);
    }

    public void getTreeValues(TreeNode root){
        if(root == null){
            return;
        }
        getTreeValues(root.left);
        values.add(root.val);
        getTreeValues(root.right);
    }
}
