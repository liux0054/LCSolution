package easy;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class LC653 {
    private List<Integer> values = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
       traverse(root);
       int i=0;
       int j=values.size()-1;
       while(i<j){
           if(values.get(i) + values.get(j) == k){
               return true;
           }else if(values.get(i) + values.get(j) > k){
               j--;
           }else{
               i++;
           }
       }
       return false;
    }

    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        values.add(root.val);
        traverse(root.right);
    }
}
