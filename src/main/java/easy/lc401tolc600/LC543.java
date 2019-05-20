package easy.lc401tolc600;

import java.util.HashMap;
import java.util.Map;

import common.TreeNode;

public class LC543 {
    Map<TreeNode, Integer> height = new HashMap<>();

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        int max = 0;
        for(TreeNode node:height.keySet()){
            max = Math.max(height.getOrDefault(node.left, 0) + height.getOrDefault(node.right, 0), max);
        }
        return max;
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        int currentHeight = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        height.put(root, currentHeight);
        return currentHeight;
    }
}
