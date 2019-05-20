package easy.lc1tolc200;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import common.TreeNode;
import easy.lc1tolc200.LC107;

public class LC107Test {

    @Test
    public void testCase1(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>(){{
            add(15);
            add(7);
        }});

        expected.add(new ArrayList<Integer>(){{
            add(9);
            add(20);
        }});

        expected.add(new ArrayList<Integer>(){{
            add(3);
        }});

        List<List<Integer>> actual = new LC107().levelOrderBottom(root);
        Assert.assertTrue(expected.get(0).containsAll(actual.get(0)) && actual.get(0).containsAll(expected.get(0)));
        Assert.assertTrue(expected.get(1).containsAll(actual.get(1)) && actual.get(1).containsAll(expected.get(1)));
        Assert.assertTrue(expected.get(2).containsAll(actual.get(2)) && actual.get(2).containsAll(expected.get(2)));
    }

    @Test
    public void testCase2(){
        TreeNode root = new TreeNode(3);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>(){{
            add(3);
        }});

        List<List<Integer>> actual = new LC107().levelOrderBottom(root);
        Assert.assertTrue(expected.get(0).containsAll(actual.get(0)) && actual.get(0).containsAll(expected.get(0)));

    }
}
