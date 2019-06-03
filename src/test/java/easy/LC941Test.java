package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC941;

public class LC941Test {
    @Test
    public void testCase1(){
        Assert.assertFalse(new LC941().validMountainArray(new int[]{2,1}));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC941().validMountainArray(new int[]{3,5,5}));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC941().validMountainArray(new int[]{0,3,2,1}));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC941().validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }
}
