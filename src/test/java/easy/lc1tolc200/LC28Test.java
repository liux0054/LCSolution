package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC28;

public class LC28Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC28().strStr("hello", "ll"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(-1, new LC28().strStr("aaaaa", "bba"));
    }
}
