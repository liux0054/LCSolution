package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC965Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        Assert.assertTrue(new LC965().isUnivalTree(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assert.assertFalse(new LC965().isUnivalTree(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);

        Assert.assertTrue(new LC965().isUnivalTree(root));
    }
}
