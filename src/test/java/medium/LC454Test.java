package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC454;

public class LC454Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(new LC454().fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2}), 2);
    }

}
