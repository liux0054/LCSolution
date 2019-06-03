package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC687;

public class LC687Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(5);

        Assert.assertEquals(2, new LC687().longestUnivaluePath(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Assert.assertEquals(2, new LC687().longestUnivaluePath(root));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC687().longestUnivaluePath(null));
    }
}
