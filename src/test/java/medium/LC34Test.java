package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC34Test {
    @Test
    public void testCase1() {
        Assert.assertArrayEquals(new int[] {3, 4}, new LC34().searchRange(
                new int[] {5,7,7,8,8,10}, 8
        ));
    }
    
    @Test
    public void testCase2() {
        Assert.assertArrayEquals(new int[] {-1, -1}, new LC34().searchRange(
                new int[] {5,7,7,8,8,10}, 6
        ));
    }

    @Test
    public void testCase3() {
        Assert.assertArrayEquals(new int[] {0, 5}, new LC34().searchRange(
                new int[] {8,8,8,8,8,8}, 8
        ));
    }
}
