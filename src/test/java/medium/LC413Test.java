package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC413;

public class LC413Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }


    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC413().numberOfArithmeticSlices(new int[]{1, 2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC413().numberOfArithmeticSlices(new int[]{1}));
    }

}
