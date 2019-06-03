package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import easy.LC507;

public class LC507Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC507().checkPerfectNumber(28));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC507().checkPerfectNumber(1));
    }

    @Test
    public void testCase3(){
        Assert.assertFalse(new LC507().checkPerfectNumber(2));
    }
}
