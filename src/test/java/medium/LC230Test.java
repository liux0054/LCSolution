package medium;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC230Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        Assert.assertEquals(1, new LC230().kthSmallest(root, 1));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        Assert.assertEquals(3, new LC230().kthSmallest(root, 3));
    }
}
