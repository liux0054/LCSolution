package easy.lc1tolc200;

import java.util.Arrays;

import common.TreeNode;

public class LC108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        if(nums.length == 2){
            TreeNode root = new TreeNode(nums[0]);
            root.right = new TreeNode(nums[1]);
        }
        int mid = (0 + nums.length)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, nums.length));
        return root;
    }
}
