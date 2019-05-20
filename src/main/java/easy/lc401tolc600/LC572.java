package easy.lc401tolc600;

import common.TreeNode;

public class LC572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) {
            return false;
        }
        if(s.val == t.val) {
            if (isSameTree(s, t)) {
                return true;
            }
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null || t == null){
            if(s == null && t == null){
                return true;
            }else{
                return false;
            }
        }
        return s.val == t.val && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
