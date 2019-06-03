package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC674;

public class LC674Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC674().findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC674().findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC674().findLengthOfLCIS(new int[]{}));
    }
}
