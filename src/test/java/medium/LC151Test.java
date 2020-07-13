package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC151Test {
    @Test
    public void testCase1() {
        Assert.assertEquals("blue is sky the", new LC151().reverseWords("the sky is blue"));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals("world! hello", new LC151().reverseWords("  hello world!  "));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals("example good a", new LC151().reverseWords("a good   example"));
    }
}
