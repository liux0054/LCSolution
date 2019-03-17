package easy.LC993;

import java.util.HashMap;
import java.util.Map;

public class LC993 {
    Map<Integer, Integer> depths = new HashMap<>();
    Map<Integer, Integer> parents = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        getDepth(root, 0, null);
        return depths.containsKey(x) && depths.containsKey(y) && depths.get(x) == depths.get(y) && parents.get(x) != parents.get(y);
    }

    private void getDepth(TreeNode root, int depth, TreeNode parent){
        if(root == null){
            return;
        }
        depths.put(root.val, depth);
        if(parent != null){
            parents.put(root.val, parent.val);
        }
        getDepth(root.left, depth+1, root);
        getDepth(root.right, depth+1, root);
    }
}
