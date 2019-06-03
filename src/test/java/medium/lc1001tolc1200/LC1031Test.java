package medium.lc1001tolc1200;

import org.junit.Assert;
import org.junit.Test;

import medium.LC1031;

public class LC1031Test {

    @Test
    public void testCase1() {
        Assert.assertEquals(20, new LC1031().maxSumTwoNoOverlap(new int[] { 0, 6, 5, 2, 2, 5, 1, 9, 4 }, 1, 2));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(29, new LC1031().maxSumTwoNoOverlap(new int[] { 3, 8, 1, 3, 2, 1, 8, 9, 0 }, 3, 2));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(31, new LC1031().maxSumTwoNoOverlap(new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8 }, 4, 3));
    }
}

