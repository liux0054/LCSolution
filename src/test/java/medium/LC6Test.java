package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC6Test {
    @Test
    public void testCase1() {
        Assert.assertEquals("PAHNAPLSIIGYIR", new LC6().convert("PAYPALISHIRING", 3));
    }
    
    @Test
    public void testCase2() {
        Assert.assertEquals("PINALSIGYAHRPI", new LC6().convert("PAYPALISHIRING", 4));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals("AB", new LC6().convert("AB", 1));
    }

    @Test
    public void testCase4() {
        Assert.assertEquals("ABCED", new LC6().convert("ABCDE", 4));
    }
}
