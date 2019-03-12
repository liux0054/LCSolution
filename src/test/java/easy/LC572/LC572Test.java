package easy.LC572;

import org.junit.Assert;
import org.junit.Test;


public class LC572Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode sub = new TreeNode(4);
        sub.left = new TreeNode(1);
        sub.right = new TreeNode(2);

        Assert.assertTrue(new LC572().isSubtree(root, sub));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);

        TreeNode sub = new TreeNode(1);

        Assert.assertTrue(new LC572().isSubtree(root, sub));
    }
}
