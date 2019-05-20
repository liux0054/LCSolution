package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.lc601tolc800.LC680;

public class LC680Test {
    @Test
    public void testCase1(){
        Assert.assertTrue(new LC680().validPalindrome("aba"));
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(new LC680().validPalindrome("abca"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC680().validPalindrome(""));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC680().validPalindrome("a"));
    }

    @Test
    public void testCase5(){
        Assert.assertFalse(new LC680().validPalindrome("abc"));
    }

    @Test
    public void testCase6(){
        Assert.assertTrue(new LC680().validPalindrome("ab"));
    }

    @Test
    public void testCase7(){
        Assert.assertTrue(new LC680().validPalindrome("eedede"));
    }
}
