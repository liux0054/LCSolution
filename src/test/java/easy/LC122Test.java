package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC122;

public class LC122Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(7, new LC122().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(4, new LC122().maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC122().maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC122().maxProfit(null));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC122().maxProfit(new int[]{3}));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(1, new LC122().maxProfit(new int[]{1,2}));
    }


    @Test
    public void testCase7(){
        Assert.assertEquals(0, new LC122().maxProfit(new int[]{2,1}));
    }

}
