package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC357;

public class LC357Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(91, new LC357().countNumbersWithUniqueDigits(2));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC357().countNumbersWithUniqueDigits(0));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(10, new LC357().countNumbersWithUniqueDigits(1));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(739, new LC357().countNumbersWithUniqueDigits(3));
    }
}
