package medium;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC979Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        Assert.assertEquals(2, new LC979().distributeCoins(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(3);
        root.right = new TreeNode(0);
        Assert.assertEquals(3, new LC979().distributeCoins(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        Assert.assertEquals(2, new LC979().distributeCoins(root));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.left.right = new TreeNode(3);
        Assert.assertEquals(4, new LC979().distributeCoins(root));
    }
}
