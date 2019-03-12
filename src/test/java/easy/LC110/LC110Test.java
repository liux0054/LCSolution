package easy.LC110;

import org.junit.Assert;
import org.junit.Test;

public class LC110Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertTrue(new LC110().isBalanced(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        Assert.assertFalse(new LC110().isBalanced(root));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC110().isBalanced(null));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);

        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);

        Assert.assertFalse(new LC110().isBalanced(root));
    }
}
