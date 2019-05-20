package medium.lc801tolc1000;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class LC938 {
    private List<Integer> listOfInts = new ArrayList<>();

    private int result = 0;

    public int rangeSumBST1(TreeNode root, int L, int R) {
        traverse1(root);
        int i=0;
        int sum = 0;
        while(i<listOfInts.size()){
            while(i<listOfInts.size() && listOfInts.get(i) >= L && listOfInts.get(i) <= R){
                sum += listOfInts.get(i);
                i++;
            }
            i++;
        }
        return sum;
    }

    private void traverse1(TreeNode root){
        if(root == null){
            return;
        }
        traverse1(root.left);
        listOfInts.add(root.val);
        traverse1(root.right);
    }


    public int rangeSumBST(TreeNode root, int L, int R) {
        travese(root, L, R);
        return result;
    }

    private void travese(TreeNode root, int L, int R){
        if(root == null){
            return;
        }
        if(root.val >= L && root.val <= R){
            result += root.val;
        }
        if(L < root.val){
            travese(root.left, L, R);
        }
        if(R > root.val){
            travese(root.right, L, R);
        }
    }

}
