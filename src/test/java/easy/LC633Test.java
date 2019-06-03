package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC633;

public class LC633Test {
    @Test
    public void testCase1(){
        Assert.assertTrue(new LC633().judgeSquareSum(5));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC633().judgeSquareSum(3));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC633().judgeSquareSum(0));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC633().judgeSquareSum(9));
    }

}
