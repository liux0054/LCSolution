package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC1524Test {
    @Test
    public void testCase1() {
        Assert.assertEquals(4, new LC1524().numOfSubarrays(new int[] {1,3,5}));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(0, new LC1524().numOfSubarrays(new int[] {2,4,6}));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(16, new LC1524().numOfSubarrays(new int[] {1,2,3,4,5,6,7}));
    }

    @Test
    public void testCase5() {
        Assert.assertEquals(4, new LC1524().numOfSubarrays(new int[] {100,100,99,99}));
    }

    @Test
    public void testCase6() {
        Assert.assertEquals(1, new LC1524().numOfSubarrays(new int[] {7}));
    }

    @Test
    public void testCase7() {
        Assert.assertEquals(35, new LC1524().numOfSubarrays(new int[] {64,69,7,78,31,83,47,84,47,6,67}));
    }
}
