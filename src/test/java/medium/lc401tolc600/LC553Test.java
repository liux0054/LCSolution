package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import medium.LC553;

public class LC553Test {

    @Test
    public void testCase1() {
        Assert.assertEquals("1000/(100/10/2)", new LC553().optimalDivision(new int[]{1000,100,10,2}));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals("1000", new LC553().optimalDivision(new int[]{1000}));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals("1000/5", new LC553().optimalDivision(new int[]{1000,5}));
    }
}
