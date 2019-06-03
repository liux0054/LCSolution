package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC326;

public class LC326Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC326().isPowerOfThree(1));
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(new LC326().isPowerOfThree(27));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC326().isPowerOfThree(9));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC326().isPowerOfThree(0));
    }

    @Test
    public void testCase5(){
        Assert.assertFalse(new LC326().isPowerOfThree(45));
    }
}
