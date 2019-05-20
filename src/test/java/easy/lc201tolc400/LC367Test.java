package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.lc201tolc400.LC367;

public class LC367Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC367().isPerfectSquare(16));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC367().isPerfectSquare(14));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC367().isPerfectSquare(1));
    }
}
