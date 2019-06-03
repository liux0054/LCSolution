package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC111;

public class LC111Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Assert.assertEquals(2, new LC111().minDepth(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(3);
        Assert.assertEquals(1, new LC111().minDepth(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assert.assertEquals(2, new LC111().minDepth(root));
    }
}
