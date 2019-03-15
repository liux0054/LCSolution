package easy.LC404;

public class LC404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getSumOfLeft(root, false);
    }

    private int getSumOfLeft(TreeNode root, boolean isLeft){
        if(root.left == null && root.right == null){
            if(isLeft){
                return root.val;
            }else{
                return 0;
            }
        }
        else if(root.left != null && root.right != null){
            return getSumOfLeft(root.left, true) + getSumOfLeft(root.right, false);
        }else if(root.left != null){
            return getSumOfLeft(root.left, true);
        }else{
            return getSumOfLeft(root.right, false);
        }
    }
}
