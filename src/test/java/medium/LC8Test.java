package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC8Test {
    @Test
    public void testCase1() {
        Assert.assertEquals(42, new LC8().myAtoi("42"));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(-42, new LC8().myAtoi(" -42"));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(4193, new LC8().myAtoi("4193 with words"));
    }

    @Test
    public void testCase4() {
        Assert.assertEquals(0, new LC8().myAtoi("words and 987"));
    }

    @Test
    public void testCase5() {
        Assert.assertEquals(-2147483648, new LC8().myAtoi("-91283472332"));
    }

    @Test
    public void testCase6() {
        Assert.assertEquals(1, new LC8().myAtoi("+1"));
    }


    @Test
    public void testCase7() {
        Assert.assertEquals(12345678, new LC8().myAtoi("  0000000000012345678"));
    }

    @Test
    public void testCase8() {
        Assert.assertEquals(12345678, new LC8().myAtoi("+"));
    }
}
