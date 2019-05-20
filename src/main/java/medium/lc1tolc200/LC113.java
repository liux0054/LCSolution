package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import common.TreeNode;

public class LC113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        getPaths(root, sum, answer, new LinkedList<>());
        return answer;
    }

    private void getPaths(TreeNode root, int remainingSum, List<List<Integer>> answer, LinkedList<Integer> currentPath){
        if(root.left == null && root.right == null){
            if(remainingSum == root.val){
                currentPath.addLast(root.val);
                answer.add(new ArrayList<>(currentPath));
                currentPath.removeLast();
            }
        }else{
            currentPath.addLast(root.val);
            if(root.left != null){
                getPaths(root.left, remainingSum - root.val, answer, currentPath);
            }
            if(root.right != null){
                getPaths(root.right, remainingSum - root.val, answer, currentPath);
            }
            currentPath.removeLast();
        }
    }

}
