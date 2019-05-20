package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.lc601tolc800.LC653;

public class LC653Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        Assert.assertTrue(new LC653().findTarget(root, 9));
        Assert.assertFalse(new LC653().findTarget(root, 28));
        Assert.assertFalse(new LC653().findTarget(root, 14));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(5);
        Assert.assertFalse(new LC653().findTarget(root, 5));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        Assert.assertTrue(new LC653().findTarget(root, 8));
    }
}
