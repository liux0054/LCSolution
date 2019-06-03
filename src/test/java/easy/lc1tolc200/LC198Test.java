package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.LC198;

public class LC198Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC198().rob(new int[]{1,2,3,1}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(12, new LC198().rob(new int[]{2,7,9,3,1}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC198().rob(new int[]{}));
    }
}
