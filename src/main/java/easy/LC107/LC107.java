package easy.LC107;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC107 {
        private Map<TreeNode, Integer> levels = new LinkedHashMap<>();

        public List<List<Integer>> levelOrderBottom1(TreeNode root) {
            if(root == null){
                return new LinkedList<>();
            }
            traverse(root, 0);
            List<List<Integer>> answer = new LinkedList<>();
            int max = 0;
            for(Integer value : levels.values()){
                max = Math.max(value, max);
            }
            for(int level = max; level >=0; level--){
                List<Integer> temp = new LinkedList<>();
                for(Map.Entry entry:levels.entrySet()){
                    if((Integer)entry.getValue() == level){
                        temp.add(((TreeNode)entry.getKey()).val);
                    }
                }
                answer.add(temp);
            }
            return answer;
        }

        private void traverse(TreeNode root, int level){
            if(root == null){
                return;
            }
            levels.put(root, level);
            traverse(root.left, level+1);
            traverse(root.right, level+1);
        }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       if(root == null){
           return new ArrayList<>();
       }

       LinkedList<List<Integer>> answer = new LinkedList<>();
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           int currentSize = queue.size();
           List<Integer> entry = new LinkedList<>();
           for(int i=0; i<currentSize; i++) {
               TreeNode temp = queue.poll();
               entry.add(temp.val);
               if(temp.left != null){
                   queue.add(temp.left);
               }
               if(temp.right != null){
                   queue.add(temp.right);
               }
           }
           answer.addFirst(entry);
       }
       return answer;
    }
}
