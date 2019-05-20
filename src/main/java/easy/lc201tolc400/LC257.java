package easy.lc201tolc400;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

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
