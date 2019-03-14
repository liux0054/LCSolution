package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC598Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC598().maxCount(3, 3, new int[][]{ {2,2}, {3,3} }));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(9, new LC598().maxCount(3, 3, new int[][]{}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC598().maxCount(3, 3, new int[][]{ {1,1}, {3,3} }));
    }
}
