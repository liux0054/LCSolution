package medium;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import medium.LC18;

public class LC18Test {

    @Test
    public void testCase1(){
        List<List<Integer>> expectAns = Arrays.asList(Arrays.asList(-1,  0, 0, 1), Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2,  0, 0, 2));
        List<List<Integer>> actualAns = new LC18().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        Assert.assertTrue(actualAns.containsAll(expectAns));
        Assert.assertTrue(expectAns.containsAll(actualAns));
    }

    @Test
    public void testCase2(){
        List<List<Integer>> expectAns = Arrays.asList(
            Arrays.asList(-3,-2,2,3), Arrays.asList(-3,-1,1,3), Arrays.asList(-3,0,0,3), Arrays.asList(-1,0,0,1),
            Arrays.asList(-3,0,1,2), Arrays.asList(-2,-1,0,3), Arrays.asList(-2,-1,1,2), Arrays.asList(-2,0,0,2));
        List<List<Integer>> actualAns = new LC18().fourSum(new int[] {-3,-2,-1,0,0,1,2,3}, 0);
        Assert.assertTrue(actualAns.containsAll(expectAns));
        Assert.assertTrue(expectAns.containsAll(actualAns));
    }
}
