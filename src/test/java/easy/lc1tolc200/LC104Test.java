package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.lc1tolc200.LC104;

public class LC104Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(3, new LC104().maxDepth(root));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new  LC104().maxDepth(null));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(3);
        Assert.assertEquals(1, new  LC104().maxDepth(root));
    }

}
