package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC646;

public class LC646Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC646().findLongestChain(new int[][]{
            {1,2}, {2,3}, {3,4}
        }));
    }
}
