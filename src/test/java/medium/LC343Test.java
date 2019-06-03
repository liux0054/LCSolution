package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC343;

public class LC343Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(1, new LC343().integerBreak(2));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(36, new LC343().integerBreak(10));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(2, new LC343().integerBreak(3));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(4, new LC343().integerBreak(4));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(9, new LC343().integerBreak(6));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(6, new LC343().integerBreak(5));
    }

    @Test
    public void testCase7(){
        Assert.assertEquals(18, new LC343().integerBreak(8));
    }
}
