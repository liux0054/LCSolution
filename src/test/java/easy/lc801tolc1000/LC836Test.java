package easy.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import easy.LC836;

public class LC836Test {
    @Test
    public void testCase1(){
        Assert.assertTrue(new LC836().isRectangleOverlap(new int[]{0,0,2,2}, new int[]{1,1,3,3}));
    }


    @Test
    public void testCase2(){
        Assert.assertFalse(new LC836().isRectangleOverlap(new int[]{0,0,1,1}, new int[]{1,0,2,1}));
    }


    @Test
    public void testCase3(){
        Assert.assertTrue(new LC836().isRectangleOverlap(new int[]{4,4,14,7}, new int[]{4,3,8,8}));
    }
}
