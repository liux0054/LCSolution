package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC543Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Assert.assertEquals(3, new LC543().diameterOfBinaryTree(root));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC543().diameterOfBinaryTree(null));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        Assert.assertEquals(0, new LC543().diameterOfBinaryTree(root));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        Assert.assertEquals(3, new LC543().diameterOfBinaryTree(root));
    }
}
