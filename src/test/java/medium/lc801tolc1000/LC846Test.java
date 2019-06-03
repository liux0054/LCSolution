package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.LC846;

public class LC846Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC846().isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC846().isNStraightHand(new int[]{1,2,3,4,5}, 4));
    }
}
