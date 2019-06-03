package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC437;

public class LC437Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        root.right.right = new TreeNode(11);

        Assert.assertEquals(3, new LC437().pathSum(root, 8));
    }


    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        Assert.assertEquals(2, new LC437().pathSum(root, 11));
    }


    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        Assert.assertEquals(3, new LC437().pathSum(root, 22));
    }

    @Test
    public void testCase4(){
        TreeNode root = new TreeNode(1);

        Assert.assertEquals(1, new LC437().pathSum(root, 1));
    }
}
