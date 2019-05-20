package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.lc601tolc800.LC665;

public class LC665Test {
    @Test
    public void testCase1(){
        Assert.assertTrue(new LC665().checkPossibility(new int[]{4,2,3}));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC665().checkPossibility(new int[]{4,2,1}));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC665().checkPossibility(new int[]{4}));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC665().checkPossibility(new int[]{3,4,2,3}));
    }

    @Test
    public void testCase5(){
        Assert.assertTrue(new LC665().checkPossibility(new int[]{2,3,3,2,4}));
    }
}
