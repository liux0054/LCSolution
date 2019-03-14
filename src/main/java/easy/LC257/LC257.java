package easy.LC257;

import java.util.ArrayList;
import java.util.List;

public class LC257 {
    private List<String> answer = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }else{
            getPath(root, "");
        }
        return answer;
    }

    private void getPath(TreeNode root, String pathTillNow){
        if(root.left == null && root.right == null){
            answer.add(pathTillNow + root.val);
        }else{
            if(root.left != null){
                getPath(root.left, pathTillNow + root.val + "->");
            }
            if(root.right != null){
                getPath(root.right, pathTillNow + root.val + "->");
            }
        }
    }
}
