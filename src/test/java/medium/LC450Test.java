package medium;

import org.junit.Test;

import common.TreeNode;

public class LC450Test {
    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        new LC450().deleteNode(root, 3);
        System.out.println("test");
    }
}
