package medium.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import medium.lc201tolc400.LC238;

public class LC238Test {
    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{24,12,8,6}, new LC238().productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{1,2}, new LC238().productExceptSelf(new int[]{2,1}));
    }
}
