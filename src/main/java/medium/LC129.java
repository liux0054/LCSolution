package medium;

import common.TreeNode;

public class LC129 {

    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        sumTillCurrentNode(0, root);
        return sum;
    }

    private void sumTillCurrentNode(int sumTillNow, TreeNode root) {
        if(root == null) {
            return;
        }

        if (root.left != null ) {
            sumTillCurrentNode(sumTillNow * 10 + root.val, root.left);
        }

        if (root.right != null) {
            sumTillCurrentNode(sumTillNow * 10 + root.val, root.right);
        }

        if(root.left == null && root.right == null) {
            sum += sumTillNow * 10 + root.val;
        }
    }
}
