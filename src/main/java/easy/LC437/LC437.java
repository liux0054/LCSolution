package easy.LC437;

public class LC437 {

    int answer = 0;

    public int pathSum(TreeNode root, int sum) {
        getPathSum(root, sum, true);
        getPathSum(root, sum, false);
        return answer;
    }

    private void getPathSum(TreeNode root, int sum, boolean inPath){
        if(root == null){
            return;
        }
        if(root != null && root.val == sum && inPath) {
            answer ++;
        }
        if (inPath){
            getPathSum(root.left, sum-root.val, true);
            getPathSum(root.right, sum-root.val, true);
        }
        else{
            getPathSum(root.left, sum, true);
            getPathSum(root.left, sum, false);
            getPathSum(root.right, sum, true);
            getPathSum(root.right, sum, false);
        }
    }
}
