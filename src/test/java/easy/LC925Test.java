package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC925;

public class LC925Test {
    @Test
    public void testCase1(){
        Assert.assertTrue(new LC925().isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC925().isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC925().isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC925().isLongPressedName("laiden", "laiden"));
    }
}
