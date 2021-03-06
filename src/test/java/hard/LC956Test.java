package hard;

import org.junit.Assert;
import org.junit.Test;

import hard.LC956;

public class LC956Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(6, new LC956().tallestBillboard(new int[]{1, 2, 3, 6}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(10, new LC956().tallestBillboard(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC956().tallestBillboard(new int[]{1, 2}));
    }
}
