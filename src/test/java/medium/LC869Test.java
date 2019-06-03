package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC869;

public class LC869Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC869().reorderedPowerOf2(1));
    }


    @Test
    public void testCase2(){
        Assert.assertTrue(new LC869().reorderedPowerOf2(16));
    }

    @Test
    public void testCase3(){
        Assert.assertFalse(new LC869().reorderedPowerOf2(10));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC869().reorderedPowerOf2(24));
    }

    @Test
    public void testCase5(){
        Assert.assertTrue(new LC869().reorderedPowerOf2(46));
    }

}
