package medium;

import java.util.Arrays;

import common.TreeNode;

public class LC654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        }else if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                maxIndex = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxIndex));
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxIndex+1, nums.length));
        return root;
    }
}
