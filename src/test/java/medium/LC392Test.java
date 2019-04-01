package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC392Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC392().isSubsequence("abc", "ahbgdc"));
    }


    @Test
    public void testCase2(){
        Assert.assertFalse(new LC392().isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC392().isSubsequence("aaaaa", "aaaaa"));
    }

}
