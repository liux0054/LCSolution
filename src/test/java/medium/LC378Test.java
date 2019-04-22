package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC378Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(13, new LC378().kthSmallest(new int[][]{
            {1,5,9},
            {10,11,13},
            {12,13,15}
        }, 8));
    }
}
