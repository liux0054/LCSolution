package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC103 {
    private List<List<Integer>> answer = new ArrayList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        traverse(root, 0);
        return answer;
    }
    
    private void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (answer.size() <= level) {
            answer.add(new ArrayList<>());
        } 
        if (level % 2 == 0) {
            answer.get(level).add(root.val);
        } else {
            answer.get(level).add(0, root.val);
        }
        traverse(root.left, level+1);
        traverse(root.right, level+1);
    }
}
