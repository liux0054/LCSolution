package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import medium.lc401tolc600.LC513;

public class LC513Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Assert.assertEquals(1, new LC513().findBottomLeftValue(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        Assert.assertEquals(7, new LC513().findBottomLeftValue(root));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        Assert.assertEquals(1, new LC513().findBottomLeftValue(root));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assert.assertEquals(2, new LC513().findBottomLeftValue(root));
    }

}
