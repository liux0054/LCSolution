package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.lc401tolc600.LC404;

public class LC404Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(24, new LC404().sumOfLeftLeaves(root));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(3);

        Assert.assertEquals(0, new LC404().sumOfLeftLeaves(root));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC404().sumOfLeftLeaves(null));
    }
}
