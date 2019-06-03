package medium;

import java.util.List;

import org.junit.Test;

import common.TreeNode;
import medium.LC113;

public class LC113Test {

    @Test
    public void testCase1(){
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

        List<List<Integer>> ans = new LC113().pathSum(root, 22);

        System.out.println("test");
    }
}
