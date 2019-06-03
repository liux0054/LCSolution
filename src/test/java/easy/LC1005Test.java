package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC1005;

public class LC1005Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC1005().largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(6, new LC1005().largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(13, new LC1005().largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(11, new LC1005().largestSumAfterKNegations(new int[]{-2,5,0,2,-2}, 3));
    }
}
