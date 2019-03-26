package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC807Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(35, new LC807().maxIncreaseKeepingSkyline(new int[][]{
            {3,0,8,4},
            {2,4,5,7},
            {9,2,6,3},
            {0,3,1,0}
        }));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC807().maxIncreaseKeepingSkyline(new int[][]{
            {3,3,3,3},
            {3,3,3,3},
            {3,3,3,3},
            {3,3,1,3}
        }));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC807().maxIncreaseKeepingSkyline(new int[][]{
            {3,3,3,3},
            {3,3,3,3},
            {3,3,3,3},
            {3,3,3,3}
        }));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC807().maxIncreaseKeepingSkyline(new int[][]{
            {3},
        }));
    }
}
