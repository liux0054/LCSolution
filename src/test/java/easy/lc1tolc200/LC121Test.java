package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC121;

public class LC121Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC121().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC121().maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC121().maxProfit(new int[]{7}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(1, new LC121().maxProfit(new int[]{1, 2}));
    }
}
