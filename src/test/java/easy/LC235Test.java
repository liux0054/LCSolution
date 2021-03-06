package easy;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC235;

public class LC235Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Assert.assertEquals(root, new LC235().lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Assert.assertEquals(root.left, new LC235().lowestCommonAncestor(root, root.left, root.left.right));
    }
}
