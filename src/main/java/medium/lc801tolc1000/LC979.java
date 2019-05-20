package medium.lc801tolc1000;

import common.TreeNode;

public class LC979 {
    private int answer = 0;

    public int distributeCoins(TreeNode root) {
         dfs(root);
         return answer;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int fromLeft = dfs(root.left);
        int fromRight = dfs(root.right);
        answer += Math.abs(fromLeft) + Math.abs(fromRight);
        return root.val - 1 + fromLeft + fromRight;
    }
}
