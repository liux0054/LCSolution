package easy.lc201tolc400;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.LC257;

public class LC257Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> expected = Arrays.asList("1->2->5", "1->3");
        List<String> actual = new LC257().binaryTreePaths(root);

        Assert.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<String> expected = Arrays.asList("1->2", "1->3");
        List<String> actual = new LC257().binaryTreePaths(root);

        Assert.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void testCase3(){
        TreeNode root = new TreeNode(1);

        List<String> expected = Arrays.asList("1");
        List<String> actual = new LC257().binaryTreePaths(root);

        Assert.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void testCase4(){

        List<String> expected = Arrays.asList();
        List<String> actual = new LC257().binaryTreePaths(null);

        Assert.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
