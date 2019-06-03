package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import medium.LC152;

public class LC152Test {

    @Test
    public void testCase1() {
        Assert.assertEquals(6, new LC152().maxProduct(new int[] { 2, 3, -2, 4 }));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(0, new LC152().maxProduct(new int[] { -2, 0, -1 }));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(0, new LC152().maxProduct(new int[] { 0 }));
    }

    @Test
    public void testCase4() {
        Assert.assertEquals(12, new LC152().maxProduct(new int[] { -2, -1, -1, 1, -2, 3, 1, 1, 0, -1, -1, -1, -1, -1, -1, -1,  1, 1, -1, -1, -1,  1, 1}));
    }

}
