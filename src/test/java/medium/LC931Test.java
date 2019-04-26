package medium;

import org.junit.Assert;
import org.junit.Test;

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
