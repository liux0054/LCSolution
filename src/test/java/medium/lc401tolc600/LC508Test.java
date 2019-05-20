package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import medium.lc401tolc600.LC508;

public class LC508Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        Assert.assertArrayEquals(new int[]{2, -3, 4}, new LC508().findFrequentTreeSum(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-5);
        Assert.assertArrayEquals(new int[]{2}, new LC508().findFrequentTreeSum(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(5);
        Assert.assertArrayEquals(new int[]{5}, new LC508().findFrequentTreeSum(root));
    }
}
