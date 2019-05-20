package medium.lc401tolc600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import common.TreeNode;

public class LC513 {
    Map<TreeNode, Integer> levels = new HashMap<>();
    List<TreeNode> nodes = new ArrayList<>();

    public int findBottomLeftValue1(TreeNode root) {
        traverse(root, 0);
        int maxLevel = Integer.MIN_VALUE;
        int answer = root.val;
        for(int i=0; i<nodes.size(); i++){
            if(levels.get(nodes.get(i)) > maxLevel){
                answer = nodes.get(i).val;
                maxLevel = levels.get(nodes.get(i));
            }
        }
        return answer;
    }

    private void traverse(TreeNode root, int level){
        if(root == null){
            return;
        }
        nodes.add(root);
        levels.put(root, level);
        traverse(root.left, level+1);
        traverse(root.right, level+1);
    }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null){
                queue.offer(root.right);
            }

            if(root.left != null){
                queue.offer(root.left);
            }
        }
        return root.val;
    }

}
