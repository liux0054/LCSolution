package medium;

import org.junit.Test;

import common.TreeNode;
import medium.LC654;

public class LC654Test {
    @Test
    public void testCase1(){
        TreeNode root = new LC654().constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        System.out.println();
    }

    @Test
    public void testCase2(){
        TreeNode root = new LC654().constructMaximumBinaryTree(new int[]{3});
        System.out.println();
    }

    @Test
    public void testCase3(){
        TreeNode root = new LC654().constructMaximumBinaryTree(new int[]{3, 1});
        System.out.println();
    }
}
