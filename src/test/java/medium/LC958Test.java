package medium;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;

public class LC958Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);

        Assert.assertTrue(new LC958().isCompleteTree(root));
    }


    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(7);

        Assert.assertFalse(new LC958().isCompleteTree(root));
    }


    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        root.right.left = new TreeNode(6);

        Assert.assertFalse(new LC958().isCompleteTree(root));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);

        Assert.assertTrue(new LC958().isCompleteTree(root));
    }

    @Test
    public void testCase5(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        Assert.assertTrue(new LC958().isCompleteTree(root));
    }

    @Test
    public void testCase6(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(5);

        Assert.assertTrue(new LC958().isCompleteTree(root));
    }
}
