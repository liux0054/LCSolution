package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC264;

public class LC264Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(12, new LC264().nthUglyNumber(10));
    }
}
