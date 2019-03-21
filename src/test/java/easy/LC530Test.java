package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC530Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);

        Assert.assertEquals(1, new LC530().getMinimumDifference(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);

        Assert.assertEquals(2, new LC530().getMinimumDifference(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(15);

        Assert.assertEquals(1, new LC530().getMinimumDifference(root));
    }

}
