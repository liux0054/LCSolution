package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC123;

public class LC123Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(6, new LC123().maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(4, new LC123().maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC123().maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC123().maxProfit(null));
    }


    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC123().maxProfit(new int[]{1}));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(0, new LC123().maxProfit(new int[]{2,1}));
    }

    @Test
    public void testCase7(){
        Assert.assertEquals(13, new LC123().maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }
}
