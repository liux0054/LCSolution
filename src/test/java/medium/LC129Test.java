package medium;

import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LC129Test {

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Assert.assertEquals(25, new LC129().sumNumbers(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        Assert.assertEquals(1026, new LC129().sumNumbers(root));
    }
}
