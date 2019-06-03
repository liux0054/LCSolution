package easy.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import easy.LC859;

public class LC859Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC859().buddyStrings("ab", "ba"));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC859().buddyStrings("ab", "ab"));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC859().buddyStrings("aa", "aa"));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC859().buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }

    @Test
    public void testCase5(){
        Assert.assertFalse(new LC859().buddyStrings("", "aa"));
    }

    @Test
    public void testCase6(){
        Assert.assertFalse(new LC859().buddyStrings("abbc", "bacc"));
    }
}
