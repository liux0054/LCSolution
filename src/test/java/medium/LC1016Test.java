package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC1016;

public class LC1016Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC1016().queryString("0110", 3));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC1016().queryString("0110", 4));
    }
}
