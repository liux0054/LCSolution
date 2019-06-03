package easy;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class LC530 {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> listOfNodeValues = new ArrayList<>();
        getListOfNodeValues(listOfNodeValues, root);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<listOfNodeValues.size(); i++){
            minDiff = Math.min(Math.abs(listOfNodeValues.get(i) - listOfNodeValues.get(i-1)), minDiff);
        }
        return minDiff;
    }

    private void getListOfNodeValues(List<Integer> values, TreeNode root){
        if(root.left != null){
            getListOfNodeValues(values, root.left);
        }

        values.add(root.val);

        if(root.right != null){
            getListOfNodeValues(values, root.right);
        }
    }
}
