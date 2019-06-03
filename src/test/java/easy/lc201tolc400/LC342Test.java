package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.LC342;

public class LC342Test {

    @Test
    public void testCase1(){
        Assert.assertFalse(new LC342().isPowerOfFour(1));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC342().isPowerOfFour(2));
    }
}
