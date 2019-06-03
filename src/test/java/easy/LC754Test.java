package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC754;

public class LC754Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC754().reachNumber(3));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(3, new LC754().reachNumber(2));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(3, new LC754().reachNumber(-2));
    }

    @Test
    public void testCase12(){
        Assert.assertEquals(7, new LC754().reachNumber(-12));
    }
}
