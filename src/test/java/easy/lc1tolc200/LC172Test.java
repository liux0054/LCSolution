package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.LC172;

public class LC172Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(0, new LC172().trailingZeroes(3));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC172().trailingZeroes(5));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(2, new LC172().trailingZeroes(10));
    }


    @Test
    public void testCase4(){
        Assert.assertEquals(452137076, new LC172().trailingZeroes(1808548329));
    }


}
