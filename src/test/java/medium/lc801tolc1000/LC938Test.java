package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import medium.LC938;

public class LC938Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Assert.assertEquals(32, new LC938().rangeSumBST(root, 7, 15));
    }

    @Test
    public void testCase2(){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);

        Assert.assertEquals(23, new LC938().rangeSumBST(root, 6, 10));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC938().rangeSumBST(null, 6, 10));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC938().rangeSumBST(new TreeNode(18), 6, 10));
    }
}
