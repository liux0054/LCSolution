package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC520Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC520().detectCapitalUse("USA"));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC520().detectCapitalUse("FlaG"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC520().detectCapitalUse("U"));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC520().detectCapitalUse("a"));
    }

    @Test
    public void testCase5(){
        Assert.assertTrue(new LC520().detectCapitalUse("leetcode"));
    }

    @Test
    public void testCase6(){
        Assert.assertTrue(new LC520().detectCapitalUse("Google"));
    }
}
