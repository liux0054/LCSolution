package easy.LC501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC501 {

    Map<Integer, Integer> count = new HashMap<>();

    public int[] findMode(TreeNode root) {
        getCount(root);
        int maxFrequency = Integer.MIN_VALUE;
        for(Map.Entry entry: count.entrySet()){
            if((int)entry.getValue() > maxFrequency){
                maxFrequency = (int)entry.getValue();
            }
        }
        List<Integer> temp = new ArrayList<>();
        for(Map.Entry entry : count.entrySet()){
            if((int)entry.getValue() == maxFrequency){
                temp.add((Integer) entry.getKey());
            }
        }
        int[] answers = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answers[i] = temp.get(i);
        }
        return answers;
    }

    public void getCount(TreeNode root){
        if(root == null){
            return;
        }
        count.put(root.val, count.containsKey(root.val) ? (count.get(root.val) + 1) : 1);
        getCount(root.left);
        getCount(root.right);
    }
}
