package easy.LC112;

import org.junit.Assert;
import org.junit.Test;

public class LC112Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        Assert.assertTrue(new LC112().hasPathSum(root, 22));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        Assert.assertFalse(new LC112().hasPathSum(root, 23));
    }

    @Test
    public void testCase3(){
        Assert.assertFalse(new LC112().hasPathSum(null, 1));
    }
}
