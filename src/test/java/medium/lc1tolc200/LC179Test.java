package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import medium.lc1tolc200.LC179;


public class LC179Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("210", new LC179().largestNumber(new int[]{10, 2}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("9534330", new LC179().largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("111", new LC179().largestNumber(new int[]{1, 1, 1}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals("0", new LC179().largestNumber(new int[]{0, 0}));
    }

    @Test
    public void testCase5(){
    Assert.assertEquals("9609938824824769735703560743981399", new LC179().largestNumber(new int[]{824,938,1399,5607,6973,5703,9609,4398,8247}));
    }
}
