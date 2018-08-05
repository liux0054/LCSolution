package medium;

import org.junit.Assert;
import org.junit.Test;


public class LC394Test {

   @Test
    public void testCase1(){
        Assert.assertEquals("aaabcbc", new LC394().decodeString("3[a]2[bc]"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("accaccacc", new LC394().decodeString("3[a2[c]]"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("abcabccdcdcdef", new LC394().decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", new LC394().decodeString("100[leetcode]"));
    }

}
