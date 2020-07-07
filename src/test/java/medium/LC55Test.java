package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC55Test {
    @Test
    public void testCase1() {
        Assert.assertTrue(new LC55().canJump(new int[] {2,3,1,1,4}));
    }

    @Test
    public void testCase2() {
        Assert.assertFalse(new LC55().canJump(new int[] {3,2,1,0,4}));
    }
}
