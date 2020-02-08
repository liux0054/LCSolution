package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC300Test {
    @Test
    public void testCase1() {
        Assert.assertEquals(4, new LC300().lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(1, new LC300().lengthOfLIS(new int[] {10}));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(0, new LC300().lengthOfLIS(new int[] {}));
    }


    @Test
    public void testCase4() {
        Assert.assertEquals(
                3,
                new LC300().lengthOfLIS(new int[] {4,10,4,3,8,9})
        );
    }
}
