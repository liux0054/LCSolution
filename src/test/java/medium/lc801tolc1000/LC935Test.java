package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.LC935;

public class LC935Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(10, new LC935().knightDialer(1));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(46, new LC935().knightDialer(3));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(20, new LC935().knightDialer(2));
    }
}
