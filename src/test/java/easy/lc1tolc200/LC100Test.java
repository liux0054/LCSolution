package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC100;

public class LC100Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC100().isSameTree(null, null));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC100().isSameTree(null, new TreeNode(1)));
    }

    @Test
    public void testCase3(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);


        Assert.assertTrue(new LC100().isSameTree(root1, root2));
    }

    @Test
    public void testCase4(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        Assert.assertFalse(new LC100().isSameTree(root1, root2));
    }

    @Test
    public void testCase5(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(1);
        root2.right = new TreeNode(2);

        Assert.assertFalse(new LC100().isSameTree(root1, root2));
    }

}
