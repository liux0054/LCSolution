package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.LC205;

public class LC205Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC205().isIsomorphic("egg", "add"));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC205().isIsomorphic("foo", "bar"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC205().isIsomorphic("paper", "title"));
    }
}
