package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC414;

public class LC414Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(1, new LC414().thirdMax(new int[]{3, 2, 1}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC414().thirdMax(new int[]{1, 2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(-2147483648, new LC414().thirdMax(new int[]{1,2,-2147483648}));
    }



    @Test
    public void testCase4(){
        Assert.assertEquals(-2147483648, new LC414().thirdMax(new int[]{1,2,-2147483648, -2147483648}));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(2, new LC414().thirdMax(new int[]{1,2,2}));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(-2147483648, new LC414().thirdMax(new int[]{-2147483648, -2147483648, -2147483648}));
    }

    @Test
    public void testCase7(){
        Assert.assertEquals(-2147483648, new LC414().thirdMax(new int[]{1,-2147483648,2}));
    }
}
