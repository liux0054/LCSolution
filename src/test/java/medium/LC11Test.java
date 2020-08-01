package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC11Test {
    
    @Test
    public void testCase1() {
        Assert.assertEquals(49, new LC11().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
