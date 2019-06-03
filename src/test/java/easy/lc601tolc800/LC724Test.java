package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.LC724;

public class LC724Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC724().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(-1, new LC724().pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(-1, new LC724().pivotIndex(new int[]{}));
    }
}
