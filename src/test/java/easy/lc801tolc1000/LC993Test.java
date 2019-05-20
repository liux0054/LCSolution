package easy.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.lc801tolc1000.LC993;

public class LC993Test {

    @Test
    public void testCase1(){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Assert.assertFalse(new LC993().isCousins(root, 4, 3));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Assert.assertTrue(new LC993().isCousins(root, 5, 4));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Assert.assertFalse(new LC993().isCousins(root, 5, 9));
    }


    @Test
    public void testCase5(){
        Assert.assertFalse(new LC993().isCousins(null, 5, 9));
    }

    @Test
    public void testCase6(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        Assert.assertFalse(new LC993().isCousins(root, 2, 3));
    }

}
