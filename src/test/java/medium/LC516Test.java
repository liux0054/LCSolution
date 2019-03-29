package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC516Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC516().longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC516().longestPalindromeSubseq("cbbd"));
    }
}
