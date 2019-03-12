package easy;

import org.junit.Assert;
import org.junit.Test;

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
