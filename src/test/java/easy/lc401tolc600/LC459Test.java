package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import easy.lc401tolc600.LC459;

public class LC459Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC459().repeatedSubstringPattern("abab"));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC459().repeatedSubstringPattern("aba"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC459().repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC459().repeatedSubstringPattern("a"));
    }
}
