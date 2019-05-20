package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.lc801tolc1000.LC931;

public class LC931Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(12, new LC931().minFallingPathSum(new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }));
    }
}
