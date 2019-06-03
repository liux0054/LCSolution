package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.LC53;

public class LC53Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(6, new LC53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(-1, new LC53().maxSubArray(new int[]{-1}));
    }
}
