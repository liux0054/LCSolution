package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC441;

public class LC441Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC441().arrangeCoins(5));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(3, new LC441().arrangeCoins(8));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(4, new LC441().arrangeCoins(10));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(60070, new LC441().arrangeCoins(1804289383));
    }


}
