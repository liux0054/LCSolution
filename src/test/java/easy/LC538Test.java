package easy;

import org.junit.Test;

import common.TreeNode;
import easy.LC538;

public class LC538Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        new LC538().convertBST(root);
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);

        TreeNode test = new LC538().convertBST(root);
        System.out.println();
    }
}
