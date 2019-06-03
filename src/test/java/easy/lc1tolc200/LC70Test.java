package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.LC70;

public class LC70Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(1, new LC70().climbStairs(1));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC70().climbStairs(2));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(3, new LC70().climbStairs(3));
    }
}
