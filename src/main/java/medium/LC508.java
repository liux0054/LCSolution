package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.TreeNode;

public class LC508 {
    private Map<Integer, Integer> count = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null){
            return new int[]{};
        }
        getSum(root);
        int maxOccurrence = 0;
        for(int occurrence : count.values()){
            maxOccurrence = Math.max(maxOccurrence, occurrence);
        }
        List<Integer> answer = new ArrayList<>();
        for(Map.Entry enty : count.entrySet()){
            if((Integer) enty.getValue() == maxOccurrence){
                answer.add((Integer) enty.getKey());
            }
        }
        return answer.stream().mapToInt(key -> key).toArray();
    }

    private int getSum(TreeNode root){
        int currentSum = root.val;
        if(root.left != null){
            currentSum += getSum(root.left);
        }
        if(root.right != null){
            currentSum += getSum(root.right);
        }
        count.put(currentSum, count.containsKey(currentSum) ? count.get(currentSum)+1 : 1);
        return currentSum;
    }
}
