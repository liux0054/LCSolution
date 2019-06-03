package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC501;

public class LC501Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        Assert.assertArrayEquals(new int[]{2}, new LC501().findMode(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);

        Assert.assertArrayEquals(new int[]{1}, new LC501().findMode(root));
    }

    @Test
    public void testCase3(){
        Assert.assertArrayEquals(new int[]{}, new LC501().findMode(null));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.left.right= new TreeNode(3);

        Assert.assertArrayEquals(new int[]{2}, new LC501().findMode(root));
    }
}
