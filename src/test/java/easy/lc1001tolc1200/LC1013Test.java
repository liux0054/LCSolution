package easy.lc1001tolc1200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1001tolc1200.LC1013;

public class LC1013Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC1013().numPairsDivisibleBy60(new int[]{30,20,150,100,40}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(3, new LC1013().numPairsDivisibleBy60(new int[]{60,60,60}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC1013().numPairsDivisibleBy60(new int[]{60}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC1013().numPairsDivisibleBy60(new int[]{10, 20}));
    }
}