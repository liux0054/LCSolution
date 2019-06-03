package medium;

import org.junit.Test;

import common.TreeNode;
import medium.LC814;

public class LC814Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        new LC814().pruneTree(root);
        System.out.println();
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        new LC814().pruneTree(root);
        System.out.println();
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.left.left = new TreeNode(0);

        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        new LC814().pruneTree(root);
        System.out.println();
    }
}
